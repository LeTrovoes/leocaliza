package br.edu.ufabc.leocaliza.entity;

import org.joda.time.Duration;
import org.joda.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Activity {

  public enum ActivityType {
    LEASE, MAINTENANCE, CLEANING, TRANSFER;
  }

  public enum ActivityStatus {
    TODO, IN_PROGRESS, WAITING, DONE, CANCELED;
  }

  @Id
  @GeneratedValue
  private long id;

  private ActivityType type;

  private ActivityStatus status;

  private LocalDateTime startedAt;

  private Duration estimatedDuration;

  private LocalDateTime endedAt;

  private String description;

  @OneToOne
  private Vehicle vehicle;

  @OneToOne
  private User user;

  @OneToOne
  private Branch startingBranch;

  @OneToOne
  private Branch endingBranch;

}
