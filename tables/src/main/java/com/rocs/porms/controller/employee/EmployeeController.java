package com.rocs.porms.controller.employee;

import com.rocs.porms.domain.employee.Employee;
import com.rocs.porms.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.OK);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Optional<Employee>> getEmployeelById(@PathVariable String id) {
        return new ResponseEntity<>(this.employeeService.getEmployeeById(id), HttpStatus.OK);
    }
}
