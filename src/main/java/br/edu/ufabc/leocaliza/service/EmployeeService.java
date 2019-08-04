package br.edu.ufabc.leocaliza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufabc.leocaliza.entity.Branch;
import br.edu.ufabc.leocaliza.entity.Employee;
import br.edu.ufabc.leocaliza.repository.EmployeeRepository;

@Service
public class EmployeeService{
  @Autowired
  EmployeeRepository employeeRepository;

  public Employee save(Employee employee) {
    return employeeRepository.save(employee);
  }

  public Employee demoteToEmployee(Employee employee) {
    employee.setEditEmployeesPermission(false);
    employee.setEditBranchesPermission(false);
    return save(employee);
  }

  public Employee promoteToManager(Employee employee) {
    employee.setEditEmployeesPermission(true);
    employee.setEditBranchesPermission(false);
    return save(employee);
  }

  public Employee promoteToGlobalManager(Employee employee) {
    employee.setEditEmployeesPermission(true);
    employee.setEditBranchesPermission(true);
    return save(employee);
  }

  public Employee transferToBranch(Employee employee, Branch branch) {
    employee.setBranch(branch);
    return save(employee);
  }
}
