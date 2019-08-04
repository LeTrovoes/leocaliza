package br.edu.ufabc.leocaliza.entity;


public enum Steering {
  MECHANICAL(0), HYDRAULIC(1), ELECTRIC(2);

  private int value;

  Steering(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

}
