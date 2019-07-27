package br.edu.ufabc.leocaliza.entity;

import javax.persistence.Entity;

@Entity
public class Employee extends User {
  public Employee(String cpf) {
    this.cpf = cpf;
  }
}
