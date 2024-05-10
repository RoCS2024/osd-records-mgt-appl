package com.test.test.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.sql.Timestamp;

@MappedSuperclass
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(length = 32)
    private String lastName;
    @Column(length = 32)
    private String firstName;
    @Column(length = 32)
    private String middleName;

    private String sex;

    private Timestamp birthdate;
    @Column(length = 32)
    private String religion;
    @Column(length = 32)
    private String email;
    @Column(length = 32)
    private String address;
    @Column(length = 11)
    private String contactNumber;
}
