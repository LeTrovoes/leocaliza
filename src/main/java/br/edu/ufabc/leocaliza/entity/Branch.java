package br.edu.ufabc.leocaliza.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;

@Entity
@Getter @Setter @NoArgsConstructor
public class Branch {
  @Id
  @GeneratedValue
  @Setter(AccessLevel.NONE)
  private long id;

  @Column(name = "branch_name", unique = true)
  private String name;

  @Column(unique = true)
  private String address;

  @OneToOne
  Employee manager;

  @OneToMany
  List<Vehicle> vehicles;
}
