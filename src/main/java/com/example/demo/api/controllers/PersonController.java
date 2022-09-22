package com.example.demo.api.controllers;

import com.example.demo.api.models.PersonATO;
import com.example.demo.mappers.PersonMapper;
import com.example.demo.models.internal.Person;
import com.example.demo.services.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;
    private final PersonMapper personMapper;

    @PostMapping
    public ResponseEntity<PersonATO> savePerson(@RequestBody PersonATO person) {
        Person resultPerson = personService.savePerson(personMapper.fromATO(person));
        log.info(person.toString());

        return ResponseEntity.ok(personMapper.toATO(resultPerson));
    }
}
