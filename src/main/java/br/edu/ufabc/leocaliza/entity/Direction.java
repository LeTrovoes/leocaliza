package br.edu.ufabc.leocaliza.entity;


public enum Direction{
  MECANICA(0), HIDRAULICA(1), ELETRICA(2);

  private int value;

  Direction(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

}
