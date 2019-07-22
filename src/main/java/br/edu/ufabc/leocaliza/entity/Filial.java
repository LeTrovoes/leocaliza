package br.edu.ufabc.leocaliza.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Filial {
  @Id
  @GeneratedValue
  private long id;

  @OneToOne
  Employee manager;
}