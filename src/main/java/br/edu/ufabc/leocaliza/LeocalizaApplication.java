package br.edu.ufabc.leocaliza;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import br.edu.ufabc.leocaliza.LeocalizaApplication;
import br.edu.ufabc.leocaliza.controller.ScreenController;
import br.edu.ufabc.leocaliza.entity.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.Getter;

@SpringBootApplication
public class LeocalizaApplication extends Application {
  ScreenController screenController;

  private ConfigurableApplicationContext springContext;
  private Parent rootNode;

  @Getter private static User user;

  public static void main(String[] args) {
    launch(LeocalizaApplication.class, args);
  }

  @Override
  public void init() throws Exception {
    springContext = SpringApplication.run(LeocalizaApplication.class);
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/login.fxml"));
    loader.setControllerFactory(springContext::getBean);
    rootNode = loader.load();
    screenController = springContext.getBean(ScreenController.class);
    screenController.addScreen("login", new FXMLLoader(getClass().getResource("/login.fxml")).load());
    screenController.addScreen("clienteMain", new FXMLLoader(getClass().getResource("/clienteMain.fxml")).load());
    screenController.addScreen("areaCliente", new FXMLLoader(getClass().getResource("/areaCliente.fxml")).load());
    screenController.addScreen("funcionarioMain", new FXMLLoader(getClass().getResource("/funcionarioMain.fxml")).load());
    screenController.addScreen("funcionarioVeiculo", new FXMLLoader(getClass().getResource("/funcionarioVeiculo.fxml")).load());
    // screenController.addScreen("gerenteFuncionario", new FXMLLoader(getClass().getResource("/gerenteFuncionario.fxml")).load());
    // screenController.addScreen("historicoGeral", new FXMLLoader(getClass().getResource("/historicoGeral.fxml")).load());
    // screenController.addScreen("limpeza", new FXMLLoader(getClass().getResource("/limpeza.fxml")).load());
    // screenController.addScreen("manutencao", new FXMLLoader(getClass().getResource("/manutencao.fxml")).load());
    // screenController.addScreen("veiculoClienteCarro", new FXMLLoader(getClass().getResource("/veiculoClienteCarro.fxml")).load());
    // screenController.addScreen("veiculoClienteMoto", new FXMLLoader(getClass().getResource("/veiculoClienteMoto.fxml")).load());
    // screenController.addScreen("veiculoClienteVan", new FXMLLoader(getClass().getResource("/veiculoClienteVan.fxml")).load());

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

  public static void setUser(User user){
    if (LeocalizaApplication.user == null)
      LeocalizaApplication.user = user;
  }

}
