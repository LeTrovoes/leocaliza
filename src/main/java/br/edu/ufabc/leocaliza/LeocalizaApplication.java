package br.edu.ufabc.leocaliza;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeocalizaApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(LeocalizaApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

  }

}
