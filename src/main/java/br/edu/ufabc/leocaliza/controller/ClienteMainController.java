package br.edu.ufabc.leocaliza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

@Controller
public class ClienteMainController {
  @Autowired
  ScreenController screenController;

  @FXML private ListView list;

  public void Init(){
    //get data with adapter

  }

  @FXML
  private void reserva() throws Exception {
  }

  @FXML
  private void areaCliente() throws Exception {
    screenController.changeScreen("areaCliente");
  }

  @FXML
  private void voltaMainCliente() throws Exception {
    // screenController.changeScreen("clienteMain");
  }

}
