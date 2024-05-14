package com.rocs.porms.repository.employee;


import com.rocs.porms.domain.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
