package br.edu.ufabc.leocaliza.entity;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
@NamedQuery(name = "Employee.findAllManagers",
  query = "select e from Employee e where e.editEmployeesPermission = true")
@NamedQuery(name = "Employee.findAllGlobalManagers",
  query = "select e from Employee e where e.editBranchesPermission = true")
public class Employee extends User {

  private boolean editEmployeesPermission = false;

  private boolean editBranchesPermission = false;

  @OneToOne
  private Branch branch;

  public Employee(String cpf) {
    setCpf(cpf);
  }
}
