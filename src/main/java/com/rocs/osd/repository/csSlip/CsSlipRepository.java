package com.rocs.osd.repository.csSlip;


import com.rocs.osd.domain.csSlip.CsSlip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CsSlipRepository extends JpaRepository<CsSlip, Long> {
}
