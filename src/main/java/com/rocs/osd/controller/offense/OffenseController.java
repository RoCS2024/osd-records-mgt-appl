package com.rocs.osd.controller.offense;

import com.rocs.osd.domain.offense.Offense;
import com.rocs.osd.service.offense.OffenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/offense/{type}")
    public ResponseEntity<List<Offense>> getOffenseByType(@PathVariable String type) {
        List<Offense> offenses = offenseService.getOffenseByType(type);
        return new ResponseEntity<>(offenses, HttpStatus.OK);
    }
}
