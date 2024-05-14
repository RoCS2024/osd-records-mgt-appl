package com.rocs.porms.service.csReport.impl;


import com.rocs.porms.domain.csReport.CsReport;
import com.rocs.porms.repository.csReport.CsReportRepository;
import com.rocs.porms.service.csReport.CsReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CsReportServiceImpl implements CsReportService {
    private CsReportRepository csReportRepository;

    @Autowired
    public CsReportServiceImpl(CsReportRepository csReportRepository) {
        this.csReportRepository = csReportRepository;
    }

    @Override
    public List<CsReport> getAllCsReport() {
        return csReportRepository.findAll();
    }

    @Override
    public Optional<CsReport> getCsReportById(Long id) {
        return csReportRepository.findById(id);
    }

    @Override
    public CsReport addCsReport(CsReport csReport) {
        return csReportRepository.save(csReport);
    }

    @Override
    public CsReport updateCsReport(CsReport csReport) {
        return csReportRepository.save(csReport);
    }
}
