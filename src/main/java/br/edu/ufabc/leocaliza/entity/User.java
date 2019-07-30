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

@Entity
@Table(name="leocalizaUser")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @NaturalId
  @Column(unique = true)
  private String cpf;

  @Column(name = "user_name")
  private String name;

  /**
   * E-mail válido do usuário.
   */
  @Column(unique = true)
  private String email;

  @Column(name = "user_password")
  private String password;

  private String endereco;

  /**
   * @param cpf the cpf to set
   */
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
