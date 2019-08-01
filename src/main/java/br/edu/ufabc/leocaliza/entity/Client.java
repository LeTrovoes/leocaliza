package br.edu.ufabc.leocaliza.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Client extends User {

  @Column(unique = true)
  private String bankcard;


  @Column(scale = 2)
  private BigDecimal owe;

  @OneToMany
  private List<Activity> log;

}
