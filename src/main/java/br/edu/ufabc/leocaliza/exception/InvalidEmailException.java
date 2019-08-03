package br.edu.ufabc.leocaliza.exception;

public class InvalidEmailException extends RuntimeException {

  public InvalidEmailException(String email) {
    super("The email " + email + " is invalid");
  }

}
