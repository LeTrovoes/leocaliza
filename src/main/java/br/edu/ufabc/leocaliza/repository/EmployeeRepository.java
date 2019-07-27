package br.edu.ufabc.leocaliza.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufabc.leocaliza.entity.User;

@Repository
public interface EmployeeRepository extends JpaRepository<User, Long> {
  List<User> findByCpf(String cpf);
}
