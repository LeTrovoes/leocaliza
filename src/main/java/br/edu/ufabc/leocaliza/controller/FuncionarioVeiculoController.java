package br.edu.ufabc.leocaliza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

@Controller
public class FuncionarioVeiculoController {
  @Autowired
  ScreenController screenController;

  @FXML private TextField eixos;
  @FXML private TextField marca;
  @FXML private TextField capacidade;
  @FXML private TextField tanque;
  @FXML private TextField ano;
  @FXML private TextField diaria;
  @FXML private TextField status;
  @FXML private TextField modelo;
  @FXML private TextField assentos;
  @FXML private CheckBox arCondicionado;
  @FXML private ComboBox cambio;
  @FXML private ComboBox direcao;
  @FXML private TextArea anotacoes;
  @FXML private ListView historico;


  public void Init() {

  }

  @FXML
  private void popLimpeza() throws Exception {
  }

  @FXML
  private void popManutencao() throws Exception {
  }

  @FXML
  private void voltarFuncionario() throws Exception {
  }

  @FXML
  private void concluirVeiculo() throws Exception {
  }

}
