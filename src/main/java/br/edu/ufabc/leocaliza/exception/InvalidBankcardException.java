package br.edu.ufabc.leocaliza.exception;

public class InvalidBankcardException extends RuntimeException {

  public InvalidBankcardException(String bankcard) {
    super("The bankcard " + bankcard + " number is invalid");
  }

}
