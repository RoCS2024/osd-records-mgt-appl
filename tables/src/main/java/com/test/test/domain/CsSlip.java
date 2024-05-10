package com.test.test.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class CsSlip implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToOne
    private Student student;

    @ManyToOne
    private Violation violation;

    private int hoursRequired;

    private String areaOfCommServ;

}
