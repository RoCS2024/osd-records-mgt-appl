package com.test.test.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class External extends Person implements Serializable {
    @Id
    private Long externalId;

}
