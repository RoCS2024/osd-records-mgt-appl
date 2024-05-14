package com.rocs.porms.service.employee.impl;

import com.rocs.porms.domain.employee.Employee;
import com.rocs.porms.repository.employee.EmployeeRepository;
import com.rocs.porms.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl (EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepository.findById(id);
    }
}
