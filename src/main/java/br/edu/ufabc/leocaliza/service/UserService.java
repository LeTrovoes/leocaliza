package br.edu.ufabc.leocaliza.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufabc.leocaliza.entity.User;
import br.edu.ufabc.leocaliza.repository.UserRepository;
import br.edu.ufabc.leocaliza.exception.InvalidLoginException;

@Service
public class UserService {
  @Autowired
  UserRepository userRepository;
  BCryptPasswordEncoder passwordEncoder;

  public UserService() {
    this.passwordEncoder = new BCryptPasswordEncoder();
  }

  public User save(User user) {
    String hashedPassword = passwordEncoder.encode(user.getPassword());
    user.setPassword(hashedPassword);
    return userRepository.save(user);
  }

  public User login(String cpf, String password) throws InvalidLoginException {

    User user = userRepository.findByCpf(cpf);

    if (user == null) {
      throw new InvalidLoginException();
    }

    if (passwordEncoder.matches(password, user.getPassword())) {
      return user;
    } else {
      throw new InvalidLoginException();
    }
  }

}
