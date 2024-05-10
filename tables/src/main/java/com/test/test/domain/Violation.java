package com.test.test.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
public class Violation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Date dateOfNotice;

    @OneToOne
    private Student student;

    @OneToOne
    private Offense offense;

    private int warningNumber;

    private int csHours;

    @Column(length = 64)
    private String disciplinaryAction;
}
