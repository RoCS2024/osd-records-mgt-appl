package com.test.test.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
public class CsReport implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToOne
    private CsSlip cs_slip;

    private Date dateOfCs;

    private Timestamp timeIn;

    private Timestamp timeOut;

    private int hoursCompleted;
    @Column(length = 32)
    private String natureOfWork;
    @Column(length = 32)
    private String station;

    @ManyToOne
    private Employee employee;
    @Column(length = 16)
    private String status;
    @Column(length = 64)
    private String remarks;
}
