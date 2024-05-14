package com.rocs.porms.repository.violation;


import com.rocs.porms.domain.violation.Violation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViolationRepository extends JpaRepository<Violation, Long> {
    List<Violation> findByStudentId(Long studentId);
}
