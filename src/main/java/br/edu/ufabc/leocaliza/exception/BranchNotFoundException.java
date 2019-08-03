package br.edu.ufabc.leocaliza.exception;

public class BranchNotFoundException extends RuntimeException {

  public BranchNotFoundException() {
    super("Couldn't find the branch");
  }

}
