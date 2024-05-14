package com.rocs.porms.service.csSlip;

import com.rocs.porms.domain.csSlip.CsSlip;
import com.rocs.porms.domain.student.Student;

import java.util.List;
import java.util.Optional;

public interface CsSlipService {
    List<CsSlip> getAllCsSlip();
    Optional<CsSlip> getCsSlipById(Long id);

    int getTotalCsHoursByStudent(Long studentId);
    void updateDeduction(Long csSlipId, int deduction);
}
