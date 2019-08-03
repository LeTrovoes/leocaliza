package br.edu.ufabc.leocaliza.exception;

public class InvalidPasswordException extends RuntimeException {

  public InvalidPasswordException(String password) {
    super("This password is too short");
  }

}
