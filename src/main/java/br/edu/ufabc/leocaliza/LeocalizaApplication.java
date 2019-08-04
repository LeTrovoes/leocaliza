package br.edu.ufabc.leocaliza;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import br.edu.ufabc.leocaliza.LeocalizaApplication;
import br.edu.ufabc.leocaliza.controller.ScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SpringBootApplication
public class LeocalizaApplication extends Application {
  ScreenController screenController;

  private ConfigurableApplicationContext springContext;
  private Parent rootNode;

  public static void main(String[] args) {
    launch(LeocalizaApplication.class, args);
  }

  @Override
  public void init() throws Exception {
    springContext = SpringApplication.run(LeocalizaApplication.class);
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/login.fxml"));
    loader.setControllerFactory(springContext::getBean);
    rootNode = loader.load();
    screenController=springContext.getBean(ScreenController.class);
    screenController.addScreen("clienteMain", new FXMLLoader(getClass().getResource("/clienteMain.fxml")).load());

  }

  @Override
  public void start(Stage stage) throws Exception {
		stage.setTitle("Leocaliza");
    Scene scene = new Scene(rootNode);
    screenController = springContext.getBean(ScreenController.class);
    screenController.setMain(scene);
    stage.setScene(scene);
    stage.show();
  }

  @Override
  public void stop() throws Exception {
    springContext.stop();
  }

}
