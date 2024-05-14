package com.rocs.porms.domain.csSlip;

import com.rocs.porms.domain.csReport.CsReport;
import com.rocs.porms.domain.station.Station;
import com.rocs.porms.domain.student.Student;
import com.rocs.porms.domain.violation.Violation;
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
    public int getHoursRequired() {
        int totalCsHours = violations.stream().mapToInt(Violation::getCsHours).sum();
        return totalCsHours - deduction;
    }
}
