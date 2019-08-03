package br.edu.ufabc.leocaliza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufabc.leocaliza.entity.Vehicle;
import br.edu.ufabc.leocaliza.entity.Vehicle.Status;
import br.edu.ufabc.leocaliza.repository.VehicleRepository;

@Service
public class VehicleService {
  @Autowired
  VehicleRepository vehicleRepository;

  public Vehicle save(Vehicle vehicle) {
    return vehicleRepository.save(vehicle);
  }

  public List<Vehicle> FindIfAvailable() {
    return vehicleRepository.findByStatus(Status.AVAILABLE);
  }

}
