package br.edu.ufabc.leocaliza.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufabc.leocaliza.entity.Motorcycle;
import br.edu.ufabc.leocaliza.entity.Vehicle;
import br.edu.ufabc.leocaliza.entity.Vehicle.Status;

@Repository
public interface MotorcycleRepository extends JpaRepository<Motorcycle, Long> {
  public List<Vehicle> findByStatus(Status status);
}
