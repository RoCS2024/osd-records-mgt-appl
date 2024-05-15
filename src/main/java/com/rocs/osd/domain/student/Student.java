package com.rocs.osd.domain.student;

import com.rocs.osd.domain.person.Person;
import com.rocs.osd.domain.section.Section;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Student extends Person implements Serializable {

    @Column(length = 10)
    private String studentNumber;
    @OneToOne
    private Section section;
}
