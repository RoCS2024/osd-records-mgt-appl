package com.rocs.osd.service.offense.impl;

import com.rocs.osd.domain.offense.Offense;
import com.rocs.osd.repository.offense.OffenseRepository;
import com.rocs.osd.service.offense.OffenseService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OffenseServiceImpl implements OffenseService {
    private OffenseRepository offenseRepository;

    public OffenseServiceImpl(OffenseRepository offenseRepository) {
        this.offenseRepository = offenseRepository;
    }

    @Override
    public List<Offense> getAllOffense() {
        return offenseRepository.findAll();
    }
}
