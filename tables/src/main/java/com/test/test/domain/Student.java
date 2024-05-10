package com.test.test.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Student extends Person implements Serializable {
    @Column(length = 10)
    private String studentNumber;
    @Column(length = 64)
    private String course;
    @Column(length = 16)
    private String section;
    @Column(length = 32)
    private String clusterHead;

}
