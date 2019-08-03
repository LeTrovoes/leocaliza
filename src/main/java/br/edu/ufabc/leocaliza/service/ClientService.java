package br.edu.ufabc.leocaliza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufabc.leocaliza.entity.Client;
import br.edu.ufabc.leocaliza.exception.UserNotFoundException;
import br.edu.ufabc.leocaliza.repository.ClientRepository;

@Service
public class ClientService {
  @Autowired
  ClientRepository clientRepository;

  public Client save(Client client) {
    client.setCpf(client.getCpf().replace("-", "").replace(".", ""));
    Validation.validateCpf(client.getCpf());
    client.setEmail(client.getEmail().toLowerCase());
    Validation.validateEmail(client.getEmail());
    Validation.validateName(client.getName());
    Validation.validatePassword(client.getPassword());
    Validation.validateBankcard(client.getBankcard());
    return clientRepository.save(client);
  }

  public Client update(Client newClient) {
    clientRepository.findById(newClient.getId())
      .orElseThrow(() -> new UserNotFoundException());
    return save(newClient);
  }

  public boolean hasDebit(String cpf){
    Client client  = clientRepository.findByCpf(cpf)
      .orElseThrow(() -> new UserNotFoundException());
      return (client.getOwe().signum() > 0);
  }

  public List<Client> findAll() {
    return clientRepository.findAll();
  }

}
