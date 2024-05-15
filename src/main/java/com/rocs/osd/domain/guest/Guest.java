package com.rocs.osd.domain.guest;

import com.rocs.osd.domain.person.Person;
import com.rocs.osd.domain.student.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Guest extends Person implements Serializable {

    private Long guestId;
    @OneToMany
    private List<Student> beneficiary;
}
