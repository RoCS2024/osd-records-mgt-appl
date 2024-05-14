package com.rocs.porms.service.offense;

import com.rocs.porms.domain.offense.Offense;

import java.util.List;
import java.util.Optional;

public interface OffenseService {
    List<Offense> getAllOffense();
    Optional<Offense> getOffenseById(Long id);
}
