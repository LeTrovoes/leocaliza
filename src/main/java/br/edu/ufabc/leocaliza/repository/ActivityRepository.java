package br.edu.ufabc.leocaliza.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufabc.leocaliza.entity.Activity;
import br.edu.ufabc.leocaliza.entity.Branch;
import br.edu.ufabc.leocaliza.entity.User;
import br.edu.ufabc.leocaliza.entity.Vehicle;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {

  public List<Activity> findByUser(User user);

  public List<Activity> findByVehicle(Vehicle vehicle);

  public List<Activity> findByStartingBranch(Branch branch);

  public List<Activity> findByEndingBranch(Branch branch);

}
