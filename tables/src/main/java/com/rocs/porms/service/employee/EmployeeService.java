package com.rocs.porms.service.employee;

import com.rocs.porms.domain.employee.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    Optional<Employee> getEmployeeById(String id);
}
