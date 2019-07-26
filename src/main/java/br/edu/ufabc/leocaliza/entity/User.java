package br.edu.ufabc.leocaliza.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;
import org.springframework.lang.NonNull;

@Entity
@Table(name="leocalizaUser")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @NaturalId
  @Column(unique = true)
  @NonNull
  protected String cpf;

}
