package com.rocs.porms.service.offense.impl;

import com.rocs.porms.domain.offense.Offense;
import com.rocs.porms.repository.offense.OffenseRepository;
import com.rocs.porms.service.offense.OffenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class OffenseServiceImpl implements OffenseService {
    private OffenseRepository offenseRepository;

    @Autowired
    public OffenseServiceImpl (OffenseRepository offenseRepository) {
        this.offenseRepository = offenseRepository;
    }

    @Override
    public List<Offense> getAllOffense() {
        return offenseRepository.findAll();
    }

    @Override
    public Optional<Offense> getOffenseById(Long id) {
        return offenseRepository.findById(id);
    }
}
