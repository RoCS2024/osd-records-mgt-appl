package com.rocs.porms.service.csSlip.impl;

import com.rocs.porms.domain.csSlip.CsSlip;
import com.rocs.porms.domain.student.Student;
import com.rocs.porms.domain.violation.Violation;
import com.rocs.porms.repository.csSlip.CsSlipRepository;
import com.rocs.porms.repository.student.StudentRepository;
import com.rocs.porms.repository.violation.ViolationRepository;
import com.rocs.porms.service.csSlip.CsSlipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CsSlipServiceImpl implements CsSlipService {
    private CsSlipRepository csSlipRepository;
    private StudentRepository studentRepository;
    private ViolationRepository violationRepository;

    @Autowired
    public CsSlipServiceImpl(CsSlipRepository csSlipRepository) {
        this.csSlipRepository = csSlipRepository;
    }

    @Override
    public List<CsSlip> getAllCsSlip() {
        return csSlipRepository.findAll();
    }

    @Override
    public Optional<CsSlip> getCsSlipById(Long id) {
        return csSlipRepository.findById(id);
    }

    @Override
    public int getTotalCsHoursByStudent(Long studentId) {
        Optional<Student> studentOpt = studentRepository.findById(studentId);
        if (studentOpt.isPresent()) {
            List<Violation> violations = violationRepository.findByStudentId(studentId);
            int totalCsHours = violations.stream().mapToInt(Violation::getCsHours).sum();
            return totalCsHours;
        } else {
            throw new IllegalArgumentException("Student not found with id: " + studentId);
        }
    }

    @Override
    public void updateDeduction(Long csSlipId, int deduction) {
        Optional<CsSlip> csSlipOpt = csSlipRepository.findById(csSlipId);
        if (csSlipOpt.isPresent()) {
            CsSlip csSlip = csSlipOpt.get();
            csSlip.setDeduction(deduction);
            csSlipRepository.save(csSlip);
        } else {
            throw new IllegalArgumentException("CsSlip not found with id: " + csSlipId);
        }
    }
}
