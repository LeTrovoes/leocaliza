package br.edu.ufabc.leocaliza.service;

import java.util.List;
import org.joda.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufabc.leocaliza.entity.Activity;
import br.edu.ufabc.leocaliza.entity.Branch;
import br.edu.ufabc.leocaliza.entity.User;
import br.edu.ufabc.leocaliza.entity.Vehicle;
import br.edu.ufabc.leocaliza.repository.ActivityRepository;

@Service
public class ActivityService {
  @Autowired
  ActivityRepository activityRepository;

  public Activity save(Activity Activity) {
    return activityRepository.save(Activity);
  }

  public List<Activity> findByUser(User user) {
    return activityRepository.findByUser(user);
  }

  public List<Activity> findByVehicle(Vehicle vehicle) {
    return activityRepository.findByVehicle(vehicle);
  }

  public List<Activity> findByStartingBranch(Branch branch) {
    return activityRepository.findByStartingBranch(branch);
  }

  public List<Activity> findByEndingBranch(Branch branch) {
    return activityRepository.findByEndingBranch(branch);
  }

  public Activity startActivity(Activity activity) {
    activity.setStartedAt(LocalDateTime.now());
    return save(activity);
  }

  public Activity endActivity(Activity activity) {
    activity.setEndedAt(LocalDateTime.now());
    return save(activity);
  }

}
