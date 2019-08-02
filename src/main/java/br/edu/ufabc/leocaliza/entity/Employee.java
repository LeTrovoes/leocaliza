package br.edu.ufabc.leocaliza.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Employee extends User {
  public Employee(String cpf) {
    setCpf(cpf);
  }
}
