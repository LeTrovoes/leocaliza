package br.edu.ufabc.leocaliza.service;

import br.edu.ufabc.leocaliza.exception.InvalidBankcardException;
import br.edu.ufabc.leocaliza.exception.InvalidCpfException;
import br.edu.ufabc.leocaliza.exception.InvalidEmailException;
import br.edu.ufabc.leocaliza.exception.InvalidNameException;
import br.edu.ufabc.leocaliza.exception.InvalidPasswordException;

public abstract class Validation {

  public static void validateCpf(String cpf) {
    if (cpf == null || !cpf.matches("\\d{11}$"))
      throw new InvalidCpfException(cpf);
  }

  public static void validateEmail(String email) {
    if (email == null || !email.matches("\\S+@[a-z]+(\\.[a-z]+)*\\.com(\\.[a-z]+)*"))
      throw new InvalidEmailException(email);
  }

  public static void validatePassword(String password) {
    if (password == null || password.length() < 8)
      throw new InvalidPasswordException(password);
  }

  public static void validateName(String name) {
    if (name == null || name.matches("([a-zA-Z]+ )*[a-zA-Z]+$"))
      throw new InvalidNameException(name);
  }

  public static void validateBankcard(String bankcard) {
    if (bankcard == null || bankcard.matches("(\\d{4} ){3}\\d{4}$"))
      throw new InvalidBankcardException(bankcard);
  }
}
