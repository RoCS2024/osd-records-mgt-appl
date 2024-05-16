package com.rocs.osd.repository.offense;

import com.rocs.osd.domain.offense.Offense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffenseRepository extends JpaRepository<Offense, String> {
}
