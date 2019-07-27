package br.edu.ufabc.leocaliza;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ufabc.leocaliza.view.MainGui;
import javafx.application.Application;

@SpringBootApplication
public class LeocalizaApplication{

  public static void main(String[] args) {
    Application.launch(MainGui.class, args);
  }

}
