package br.edu.ufabc.leocaliza.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufabc.leocaliza.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
  public Optional<Client> findByCpf(String cpf);
}
