package br.edu.ufabc.leocaliza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.ufabc.leocaliza.entity.Branch;
import br.edu.ufabc.leocaliza.entity.Client;
import br.edu.ufabc.leocaliza.entity.Employee;
import br.edu.ufabc.leocaliza.entity.Vehicle;
import br.edu.ufabc.leocaliza.LeocalizaApplication;
import br.edu.ufabc.leocaliza.service.BranchService;
import br.edu.ufabc.leocaliza.service.ClientService;
import br.edu.ufabc.leocaliza.service.EmployeeService;
import br.edu.ufabc.leocaliza.service.VehicleService;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

@Controller
public class FuncionarioMainController {
  @Autowired ScreenController screenController;
  @Autowired BranchService branchService;
  @Autowired ClientService clientService;
  @Autowired EmployeeService employeeService;
  @Autowired VehicleService vehicleService;

  @FXML private ListView veiculos;
  @FXML private ListView clientes;
  @FXML private ListView filiais;

  public void Init() {
    Employee user = (Employee)LeocalizaApplication.getUser();

    // Fill vehicles
    List<Vehicle> listaVeiculos = vehicleService.FindIfAvailable();
    for (Vehicle var : listaVeiculos) {
        veiculos.getItems().add(var.getModel() + " - " + var.getStatus());
    }

    // Fill employees
    List<Client> listaClientes = clientService.findAll();
    for (Client var : listaClientes) {
        clientes.getItems().add(var.getCpf() + " - " + var.getName());
    }

    // Fill branches
    List<Branch> listaFiliais = branchService.findAll();
    for (Branch var : listaFiliais) {
        filiais.getItems().add(var.getName() + " - " + var.getAddress());
    }

  }

  @FXML
  private void reserva() throws Exception {
  }

  @FXML
  private void areaFuncionario() throws Exception {
    screenController.changeScreen("areaFuncionario");
  }

  @FXML
  private void voltaMainFuncionario() throws Exception {
    // screenController.changeScreen("FuncionarioMain");
  }

  @FXML
  private void editFuncionario() throws Exception {
  }

}
