package br.edu.ufabc.leocaliza.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branch {
  @Id
  @GeneratedValue
  private long id;

  @Column(name = "branch_name", unique = true)
  private String name;

  @Column(unique = true)
  private String endereco;

  @OneToOne
  Employee manager;

  @OneToMany
  List<Vehicle> vehicles;
}
