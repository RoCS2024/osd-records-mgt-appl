package com.test.test.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Employee extends Person implements Serializable {
    @Id
    private String employeeNumber;
    @Column(length = 32)
    private String positionInRc;
}
