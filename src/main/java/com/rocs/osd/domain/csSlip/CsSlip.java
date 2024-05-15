package com.rocs.osd.domain.csSlip;

import com.rocs.osd.domain.csReport.CsReport;
import com.rocs.osd.domain.station.Station;
import com.rocs.osd.domain.student.Student;
import com.rocs.osd.domain.violation.Violation;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class CsSlip implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Student student;
    private String reasonOfCs;
    @ManyToOne
    private Station areaOfCommServ;
    @OneToMany
    private List<CsReport> reports;

    @OneToMany
    private List<Violation> violations;
    private int deduction;
}
