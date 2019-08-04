package br.edu.ufabc.leocaliza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.ufabc.leocaliza.service.UserService;
import javafx.fxml.FXML;

@Controller
public class LoginController {
  @Autowired
  ScreenController screenController;

  @Autowired
  UserService userService;

  @FXML
  private void teste() throws Exception {
    screenController.changeScreen("clienteMain");
  }
}
