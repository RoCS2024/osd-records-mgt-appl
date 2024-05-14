package com.rocs.porms.controller.violation;

import com.rocs.porms.domain.violation.Violation;
import com.rocs.porms.service.violation.ViolationService;
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
@RequestMapping("/Violation")
public class ViolationController {
    private ViolationService violationService;

    @Autowired
    public ViolationController(ViolationService violationService) {
        this.violationService = violationService;
    }

    @GetMapping("/violations")
    public ResponseEntity<List<Violation>> getAllViolation() {
        return new ResponseEntity<>(violationService.getAllViolation(), HttpStatus.OK);
    }

    @GetMapping("/violation/{id}")
    public ResponseEntity<Optional<Violation>> getViolationById(@PathVariable Long id) {
        return new ResponseEntity<>(this.violationService.getViolationById(id), HttpStatus.OK);
    }

    @GetMapping("/violation/student/{studentId}")
    public ResponseEntity<List<Violation>> getAllViolationByStudentId(@PathVariable Long studentId) {
        return new ResponseEntity<>(this.violationService.getAllViolationByStudentId(studentId), HttpStatus.OK);
    }
}
