package com.rocs.porms.domain.violation;

import com.rocs.porms.domain.employee.Employee;
import com.rocs.porms.domain.offense.Offense;
import com.rocs.porms.domain.student.Student;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
    @OneToMany
    private List<Employee> notedBy;
    @OneToOne
    private Employee approvedBy;
}
