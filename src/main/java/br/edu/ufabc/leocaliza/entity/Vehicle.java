package br.edu.ufabc.leocaliza.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter @Setter @NoArgsConstructor
public abstract class Vehicle {

  public enum Status {
    AVAILABLE(0), MAINTENANCE(1), CLEANING(2), RENTED(3);

    private int type;

    Status(int type) {
      this.type = type;
    }

    public int getType() {
      return type;
    }
  }

  @Id
  @GeneratedValue
  @Setter(AccessLevel.NONE)
  private long id;

  private int wheels;

  private float fuel;

  @Column(scale = 2)
  private BigDecimal price;

  @Temporal(TemporalType.DATE)
  private Date fabricationYear;

  @OneToOne
  private Branch branch;

  @OneToMany
  private List<Activity> log;

  private String annotations;

  private int trunck;

  @Enumerated(EnumType.ORDINAL)
  private Status status;

}
