package br.edu.ufabc.leocaliza.exception;

public class InvalidCpfException extends RuntimeException {

  public InvalidCpfException(String cpf) {
    super("The CPF " + cpf + " is invalid");
  }

}
