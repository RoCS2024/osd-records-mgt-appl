package com.rocs.porms.controller.offense;

import com.rocs.porms.domain.offense.Offense;
import com.rocs.porms.service.offense.OffenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Offense")
public class OffenseController {
    private OffenseService offenseService;

    @Autowired
    public OffenseController(OffenseService offenseService) {
        this.offenseService = offenseService;
    }

    @GetMapping("/offenses")
    public ResponseEntity<List<Offense>> getAllOffense() {
        return new ResponseEntity<>(offenseService.getAllOffense(), HttpStatus.OK);
    }

    @GetMapping("/offense/{id}")
    public ResponseEntity<Optional<Offense>> getOffenseById(@PathVariable Long id) {
        return new ResponseEntity<>(this.offenseService.getOffenseById(id), HttpStatus.OK);
    }
}
