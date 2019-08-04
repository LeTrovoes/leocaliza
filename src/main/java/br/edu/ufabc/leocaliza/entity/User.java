package br.edu.ufabc.leocaliza.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name="leocalizaUser")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter @Setter @NoArgsConstructor
public abstract class User implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Setter(AccessLevel.NONE)
  private long id;

  @NaturalId
  @Column(unique = true)
  private String cpf;

  @Column(name = "user_name")
  private String name;

  @Column(unique = true)
  private String email;

  @Column(name = "user_password")
  private String password;

  private String address;

  @OneToMany
  private List<Activity> log = new ArrayList<Activity>();

}
