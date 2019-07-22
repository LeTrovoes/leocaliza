package br.edu.ufabc.leocaliza.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ufabc.leocaliza.entity.User;
import br.edu.ufabc.leocaliza.repository.UserRepository;

public class UserService{
    @Autowired
    UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }
}