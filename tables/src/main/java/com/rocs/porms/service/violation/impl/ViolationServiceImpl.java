package com.rocs.porms.service.violation.impl;

import com.rocs.porms.domain.violation.Violation;
import com.rocs.porms.repository.violation.ViolationRepository;
import com.rocs.porms.service.violation.ViolationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ViolationServiceImpl implements ViolationService {
    private ViolationRepository violationRepository;

    @Autowired
    public ViolationServiceImpl (ViolationRepository violationRepository) {
        this.violationRepository = violationRepository;
    }

    @Override
    public List<Violation> getAllViolation() {
        return violationRepository.findAll();
    }

    @Override
    public Optional<Violation> getViolationById(Long id) {
        return violationRepository.findById(id);
    }

    @Override
    public List<Violation> getAllViolationByStudentId(Long studentId) {
        return violationRepository.findByStudentId(studentId);
    }
}
