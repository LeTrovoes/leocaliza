package br.edu.ufabc.leocaliza.exception;

public class NoManagerException extends RuntimeException {

  public NoManagerException() {
    super("Define a manager for the branch");
  }

}
