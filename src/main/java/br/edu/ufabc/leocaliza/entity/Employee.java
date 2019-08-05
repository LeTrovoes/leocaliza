package br.edu.ufabc.leocaliza.entity;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Employee extends User {

  private boolean editEmployeesPermission = false;

  private boolean editBranchesPermission = false;

  @OneToOne
  private Branch branch;

}
