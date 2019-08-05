package br.edu.ufabc.leocaliza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

@Controller
public class AreaClienteController {
  @Autowired
  ScreenController screenController;

  @Autowired
  ClienteMainController clienteMainController;

  @FXML private ListView list;
  @FXML private TextField nome;
  @FXML private TextField sobrenome;
  @FXML private TextField endereco;
  @FXML private TextField numero;
  @FXML private TextField bairro;
  @FXML private TextField cep;
  @FXML private TextField dataNascimento;
  @FXML private TextField cpf;
  @FXML private TextField email;
  @FXML private TextField senha;


  public void Init() {

    nome.setText("nome");
    list.getItems().add(list.getItems().size(), "el");

  }

  @FXML
  private void voltaMainCliente() throws Exception {
    screenController.changeScreen("clienteMain");
    clienteMainController.Init();
  }

}
