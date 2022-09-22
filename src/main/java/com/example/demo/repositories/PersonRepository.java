package com.example.demo.repositories;

import com.example.demo.models.dto.PersonDTO;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class PersonRepository {

    public PersonDTO savePerson(PersonDTO person) {
        person.setId(UUID.randomUUID().toString());
        log.info("Saved person: ");
        log.info(person.toString());

        return person;
    }
}
