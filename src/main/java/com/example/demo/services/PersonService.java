package com.example.demo.services;

import com.example.demo.mappers.PersonMapper;
import com.example.demo.models.internal.Person;
import com.example.demo.repositories.PersonRepository;
import lombok.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public Person savePerson(Person person) {
        return personMapper.fromDTO(personRepository.savePerson(personMapper.toDTO(person)));
    }
}
