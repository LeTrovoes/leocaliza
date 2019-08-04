package br.edu.ufabc.leocaliza.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.ufabc.leocaliza.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  List<Employee> findByCpf(String cpf);

  @Query("select e from Employee e where e.editEmployeesPermission = true")
  List<Employee> findAllManagers();

  @Query("select e from Employee e where e.editBranchesPermission = true")
  List<Employee> findAllGlobalManagers();
}
