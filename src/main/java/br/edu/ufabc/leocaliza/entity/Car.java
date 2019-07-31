package br.edu.ufabc.leocaliza.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Car extends Vehicle {
  private int places;

  private boolean airConditioning;

  private boolean gearshift;

  @Enumerated(EnumType.ORDINAL)
  private Steering direction;

// - portaMala :

}
