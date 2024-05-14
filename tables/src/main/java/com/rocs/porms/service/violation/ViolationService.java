package com.rocs.porms.service.violation;

import com.rocs.porms.domain.violation.Violation;

import java.util.List;
import java.util.Optional;

public interface ViolationService {
    List<Violation> getAllViolation();
    Optional<Violation> getViolationById(Long id);
    List<Violation> getAllViolationByStudentId(Long studentId);
}
