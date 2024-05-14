package com.rocs.porms.domain.external;

import com.rocs.porms.domain.person.Person;
import com.rocs.porms.domain.station.Station;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class External extends Person implements Serializable {

    private Long externalId;
    @OneToOne
    private Station station;
}
