package com.rocs.porms.controller.csReport;

import com.rocs.porms.domain.csReport.CsReport;
import com.rocs.porms.service.csReport.CsReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/CSReport")
public class CsReportController {
    private CsReportService csReportService;

    @Autowired
    public CsReportController(CsReportService csReportService) {
        this.csReportService = csReportService;
    }

    @GetMapping("/commServReports")
    public ResponseEntity<List<CsReport>> getAllCsReport() {
        return new ResponseEntity<>(csReportService.getAllCsReport(), HttpStatus.OK);
    }

    @GetMapping("/commServReport/{id}")
    public ResponseEntity<Optional<CsReport>> getCsReportById(@PathVariable Long id) {
        return new ResponseEntity<>(this.csReportService.getCsReportById(id), HttpStatus.OK);
    }

    @PostMapping("/commServReport")
    public ResponseEntity<String> addCsReport(@RequestBody CsReport csReport){
        try {
            csReportService.addCsReport(csReport);
            return new ResponseEntity<>("CS Report successfully added", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("CS Report cannot be added", HttpStatus.OK);
        }
    }
}
