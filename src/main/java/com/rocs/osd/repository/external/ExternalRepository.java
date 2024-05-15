package com.rocs.osd.repository.external;

import com.rocs.osd.domain.external.External;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExternalRepository extends JpaRepository<External, Long> {
}
