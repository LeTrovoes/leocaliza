package br.edu.ufabc.leocaliza.exception;

public class UserNotFoundException extends RuntimeException {

  public UserNotFoundException() {
    super("Couldn't find the user");
  }

}
