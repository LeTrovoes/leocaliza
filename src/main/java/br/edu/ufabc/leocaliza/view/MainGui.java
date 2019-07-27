package br.edu.ufabc.leocaliza.view;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import br.edu.ufabc.leocaliza.LeocalizaApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainGui extends Application {
  private ConfigurableApplicationContext springContext;

  @Override
  public void init() throws Exception {
    springContext = SpringApplication.run(LeocalizaApplication.class);
  }

  @Override
  public void start(Stage stage) throws Exception {
    stage.centerOnScreen();
		stage.setOnCloseRequest(e -> {
			Platform.exit();
			System.exit(0);
    });
    Scene scene = new Scene(new StackPane(), 640, 480);
		stage.setScene(scene);
		stage.show();
  }

  @Override
  public void stop() throws Exception {
    springContext.stop();
  }
}
