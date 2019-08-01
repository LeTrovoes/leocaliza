package br.edu.ufabc.leocaliza.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Car extends Vehicle {
  private int seats;

  private boolean airConditioning;

  private boolean gearshift;

  @Enumerated(EnumType.ORDINAL)
  private Steering steering;

  private int trunck;

}
