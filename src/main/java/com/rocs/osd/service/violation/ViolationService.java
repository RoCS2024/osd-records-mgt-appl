package com.rocs.osd.service.violation;

import com.rocs.osd.domain.violation.Violation;

import java.util.List;
import java.util.Optional;

public interface ViolationService {
    List<Violation> getAllViolation();
    Optional<Violation> getViolationById(Long id);
    List<Violation> getAllViolationByStudentId(Long studentId);
}
