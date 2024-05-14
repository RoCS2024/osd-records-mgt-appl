package com.rocs.porms.service.csReport;


import com.rocs.porms.domain.csReport.CsReport;

import java.util.List;
import java.util.Optional;

public interface CsReportService {
    List<CsReport> getAllCsReport();
    Optional<CsReport> getCsReportById(Long id);
    CsReport addCsReport(CsReport csReport);
    CsReport updateCsReport(CsReport csReport);
}
