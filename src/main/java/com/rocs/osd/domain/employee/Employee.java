package com.rocs.osd.domain.employee;

import com.rocs.osd.domain.person.Person;
import com.rocs.osd.domain.station.Station;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Employee extends Person implements Serializable {

    private String employeeNumber;
    @Column(length = 32)
    private String positionInRc;
    private Date dateEmployed;
    private String sssNo;
    private String tinNo;
    private String pagibigNo;
    @OneToOne
    private Station station;
}
