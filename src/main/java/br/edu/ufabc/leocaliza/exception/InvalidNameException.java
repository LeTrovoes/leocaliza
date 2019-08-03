package br.edu.ufabc.leocaliza.exception;

public class InvalidNameException extends RuntimeException {

  public InvalidNameException(String name) {
    super("The name " + name + " is invalid");
  }

}
