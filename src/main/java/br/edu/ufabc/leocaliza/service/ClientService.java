package br.edu.ufabc.leocaliza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufabc.leocaliza.entity.Client;
import br.edu.ufabc.leocaliza.exception.InvalidCpfException;
import br.edu.ufabc.leocaliza.exception.InvalidEmailException;
import br.edu.ufabc.leocaliza.exception.InvalidPasswordException;
import br.edu.ufabc.leocaliza.repository.ClientRepository;

@Service
public class ClientService {
  @Autowired
  ClientRepository clientRepository;

  public Client save(Client client) {
    client.setCpf(client.getCpf().replace("-", "").replace(".", ""));
    validateCpf(client.getCpf());
    client.setEmail(client.getEmail().toLowerCase());
    validateEmail(client.getEmail());
    validateName(client.getName());
    validatePassword(client.getPassword());
    validateBankcard(client.getBankcard());
    return clientRepository.save(client);
  }

  public Client update(Client newClient) {
    Client client  = clientRepository.findById(newClient.getId())
      .orElseThrow(new UserNotFoundException(newClient));
    client.setEmail(newClient.getEmail());
    client.setAddress(newClient.getAddress());
    client.setBankcard(newClient.getBankcard());
    client.setPassword(newClient.getPassword());
    save(client);
  }

  public List<Client> findAll() {
    return clientRepository.findAll();
  }

  public void validateCpf(String cpf) {
    if (cpf == null || !cpf.matches("\\d{11}$"))
      throw new InvalidCpfException(cpf);
  }

  public void validateEmail(String email) {
    if (email == null || !email.matches("\\S+@[a-z]+(\\.[a-z]+)*\\.com(\\.[a-z]+)*"))
      throw new InvalidEmailException(email);
  }

  public void validatePassword(String password) {
    if (password == null || password.length() < 8)
      throw new InvalidPasswordException(password);
  }

  public void validateName(String name) {
    if (name == null || name.matches("([a-zA-Z]+ )*[a-zA-Z]+$"))
      throw new InvalidNameException(name);
  }

  public void validateBankcard(String bankcard) {
    if (bankcard == null || bankcard.matches("(\\d{4} ){3}\\d{4}$"))
      throw new InvalidBankcardException(bankcard);
  }

}
