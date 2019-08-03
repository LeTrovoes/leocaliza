package br.edu.ufabc.leocaliza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufabc.leocaliza.entity.Client;
import br.edu.ufabc.leocaliza.exception.InvalidCpfException;
import br.edu.ufabc.leocaliza.exception.InvalidEmailException;
import br.edu.ufabc.leocaliza.repository.ClientRepository;

@Service
public class ClientService {
  @Autowired
  ClientRepository clientRepository;

  public Client save(Client client) {
    client.setCpf(client.getCpf());
    validateCpf(client.getCpf().replace("-", "").replace(".", ""));
    client.setEmail(client.getEmail().toLowerCase());
    validateEmail(client.getEmail());
    return clientRepository.save(client);
  }

  public List<Client> findAll() {
    return clientRepository.findAll();
  }

  private void validateCpf (String cpf) {
    if (cpf == null || !cpf.matches("\\d{11}"))
      throw new InvalidCpfException(cpf);
  }

  private void validateEmail (String email) {
    if (!email.matches("\\S+@[a-z]+(\\.[a-z]+)*\\.com(\\.[a-z]+)*"))
    throw new InvalidEmailException(email);
  }

}
