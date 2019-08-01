package br.edu.ufabc.leocaliza.entity;

import org.joda.time.Duration;
import org.joda.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;

import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter @Setter @NoArgsConstructor
public class Activity {

  public enum ActivityType {
    LEASE(0), MAINTENANCE(1), CLEANING(2), TRANSFER(3);

    private int type;

    ActivityType(int type) {
      this.type = type;
    }

    public int getType() {
      return type;
    }
  }

  public enum ActivityStatus {
    TODO(0), IN_PROGRESS(1), WAITING(2), DONE(3), CANCELED(4);

    private int status;

    ActivityStatus(int status) {
      this.status = status;
    }

    public int getStatus() {
      return status;
    }
  }

  @Id
  @GeneratedValue
  @Setter(AccessLevel.NONE)
  private long id;

  @Enumerated(EnumType.ORDINAL)
  private ActivityType type;

  @Enumerated(EnumType.ORDINAL)
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
