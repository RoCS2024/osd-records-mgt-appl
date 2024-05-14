package com.rocs.porms.repository.offense;


import com.rocs.porms.domain.offense.Offense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffenseRepository extends JpaRepository<Offense, Long> {
}
