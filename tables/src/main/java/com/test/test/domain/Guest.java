package com.test.test.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Guest extends Person implements Serializable {

    @Id
    private Long guestId;

}
