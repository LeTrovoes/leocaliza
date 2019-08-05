package br.edu.ufabc.leocaliza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.ufabc.leocaliza.LeocalizaApplication;
import br.edu.ufabc.leocaliza.entity.Client;
import br.edu.ufabc.leocaliza.entity.Employee;
import br.edu.ufabc.leocaliza.entity.User;
import br.edu.ufabc.leocaliza.service.UserService;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

@Controller
public class LoginController {
  @Autowired
  ScreenController screenController;

  @Autowired
  UserService userService;

  @Autowired
  ClienteMainController clienteMainController;

  @Autowired
  FuncionarioMainController funcionarioMainController;

  @FXML private TextField login;
  @FXML private PasswordField password;

  @FXML
  private void fLogin() throws Exception {
    User user = userService.login(login.getText(), password.getText());
    LeocalizaApplication.setUser(user);
    if (user instanceof Client) {
      screenController.changeScreen("clienteMain");
      clienteMainController.Init();
    } else if (user instanceof Employee) {
      screenController.changeScreen("funcionarioMain");
      funcionarioMainController.Init();
    }
  }
}
