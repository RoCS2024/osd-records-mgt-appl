package com.rocs.osd.controller.csSlip;

import com.rocs.osd.domain.csReport.CsReport;
import com.rocs.osd.domain.csSlip.CsSlip;
import com.rocs.osd.service.csSlip.CsSlipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/CSSlip")
public class CsSlipController {
    private CsSlipService csSlipService;

    @Autowired
    public CsSlipController(CsSlipService csSlipService) {
        this.csSlipService = csSlipService;
    }

    @GetMapping("/commServSlips")
    public ResponseEntity<List<CsSlip>> getAllCsSlip() {
        return new ResponseEntity<>(csSlipService.getAllCsSlip(), HttpStatus.OK);
    }

    @GetMapping("/commServSlip/{id}")
    public ResponseEntity<Optional<CsSlip>> getCsSlipById(@PathVariable Long id) {
        return new ResponseEntity<>(this.csSlipService.getCsSlipById(id), HttpStatus.OK);
    }

    @GetMapping("/totalCsHours/{studentId}")
    public ResponseEntity<Integer> getTotalCsHoursByStudent(@PathVariable Long studentId) {
        int totalCsHours = csSlipService.getTotalCsHoursByStudent(studentId);
        return new ResponseEntity<>(totalCsHours, HttpStatus.OK);
    }

    @PutMapping("/updateDeduction/{csSlipId}")
    public ResponseEntity<String> updateDeduction(@PathVariable Long csSlipId, @RequestParam int deduction) {
        try {
            csSlipService.updateDeduction(csSlipId, deduction);
            return new ResponseEntity<>("Deduction updated successfully.", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to update deduction: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
//    http://localhost:8080/CSSlip/updateDeduction/1?deduction=2
}
