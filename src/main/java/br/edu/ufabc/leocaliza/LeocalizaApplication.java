package br.edu.ufabc.leocaliza;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import br.edu.ufabc.leocaliza.LeocalizaApplication;
import br.edu.ufabc.leocaliza.entity.Employee;
import br.edu.ufabc.leocaliza.repository.EmployeeRepository;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;

@SpringBootApplication
public class LeocalizaApplication extends Application {
  private ConfigurableApplicationContext springContext;
  private Parent rootNode;
  private FXMLLoader loader;
  public static void main(String[] args) {
    Application.launch(LeocalizaApplication.class, args);
  }

  @Override
  public void init() throws Exception {
    springContext = SpringApplication.run(LeocalizaApplication.class);
    loader = new FXMLLoader(getClass().getResource("/clienteMain.fxml"));
    loader.setControllerFactory(springContext::getBean);
    rootNode = loader.load();
  }

  @Override
  public void start(Stage stage) throws Exception {
    // stage.centerOnScreen();
		// stage.setOnCloseRequest(e -> {
		// 	Platform.exit();
		// 	System.exit(0);
    // });
		stage.setTitle("Leocaliza");
		Scene scene = new Scene(rootNode);
		stage.setScene(scene);
		stage.show();
  }

  @Override
  public void stop() throws Exception {
    springContext.stop();
  }

}
