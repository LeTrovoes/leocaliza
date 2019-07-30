package br.edu.ufabc.leocaliza.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Vehicle {
  @Id
  @GeneratedValue
  private long id;

  private int wheels;

  private float fuel;

  @Column(scale = 2)
  private BigDecimal price;

  @Temporal(TemporalType.DATE)
  private Date fabricationYear;

  @OneToOne
  private Branch branch;
  // -historico :
  // -anotacoes :

}
