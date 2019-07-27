package br.edu.ufabc.leocaliza.view;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import br.edu.ufabc.leocaliza.LeocalizaApplication;
import br.edu.ufabc.leocaliza.entity.Employee;
import br.edu.ufabc.leocaliza.repository.EmployeeRepository;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
    StackPane pane = new StackPane();
    Button button = new Button("Test");
    button.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        EmployeeRepository rep = springContext.getBean(EmployeeRepository.class);
        rep.save(new Employee("11111111111"));
      }
  });
    pane.getChildren().add(button);
    Scene scene = new Scene(pane, 640, 480);
		stage.setScene(scene);
    stage.show();
  }

  @Override
  public void stop() throws Exception {
    springContext.stop();
  }
}
