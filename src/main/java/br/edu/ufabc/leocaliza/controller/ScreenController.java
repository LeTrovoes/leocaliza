package br.edu.ufabc.leocaliza.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import lombok.Setter;

@Controller
public class ScreenController {
  static HashMap<String, Pane> screenMap = new HashMap<>();
  @Setter private static Scene main;

  public void addScreen(String name, Pane screen) {
    screenMap.put(name, screen);
  }

  public void changeScreen(String name){
    main.setRoot( screenMap.get(name) );
  }
}
