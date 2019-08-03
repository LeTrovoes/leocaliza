package br.edu.ufabc.leocaliza.exception;

public class InvalidLoginException extends Exception {

  public InvalidLoginException() {
    super("CPF ou senha inválidos");
  }

}
