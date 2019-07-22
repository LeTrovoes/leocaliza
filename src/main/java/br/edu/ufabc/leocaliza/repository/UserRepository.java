package br.edu.ufabc.leocaliza.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.ufabc.leocaliza.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
  List<User> findByCpf(String cpf);
}
