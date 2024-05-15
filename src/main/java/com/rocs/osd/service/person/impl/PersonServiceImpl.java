package com.rocs.osd.service.person.impl;

import com.rocs.osd.domain.person.Person;
import com.rocs.osd.repository.person.PersonRepository;
import com.rocs.osd.service.person.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    private PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }
}
