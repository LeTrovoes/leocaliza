package br.edu.ufabc.leocaliza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufabc.leocaliza.entity.Vehicle;
import br.edu.ufabc.leocaliza.entity.Vehicle.Status;
import br.edu.ufabc.leocaliza.repository.CarRepository;
import br.edu.ufabc.leocaliza.repository.MotorcycleRepository;
import br.edu.ufabc.leocaliza.repository.VanRepository;
import br.edu.ufabc.leocaliza.repository.VehicleRepository;

@Service
public class VehicleService {
  @Autowired
  VehicleRepository vehicleRepository;
  @Autowired
  CarRepository carRepository;
  @Autowired
  VanRepository vanRepository;
  @Autowired
  MotorcycleRepository motorcycleRepository;

  public Vehicle save(Vehicle vehicle) {
    return vehicleRepository.save(vehicle);
  }

  public List<Vehicle> FindIfAvailable() {
    return vehicleRepository.findByStatus(Status.AVAILABLE);
  }

  public List<Vehicle> FindCarIfAvailable() {
    return carRepository.findByStatus(Status.AVAILABLE);
  }

  public List<Vehicle> FindVanIfAvailable() {
    return vanRepository.findByStatus(Status.AVAILABLE);
  }

  public List<Vehicle> FindMotorcycleIfAvailable() {
    return motorcycleRepository.findByStatus(Status.AVAILABLE);
  }

}
