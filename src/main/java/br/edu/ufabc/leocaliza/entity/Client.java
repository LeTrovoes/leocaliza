package br.edu.ufabc.leocaliza.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Client extends User {

  @Column(unique = true)
  private String bankcard;


  @Column(scale = 2)
  private BigDecimal owe;

// - historicoReserva :
}
