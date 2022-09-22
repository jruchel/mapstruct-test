package com.example.demo.mappers;

import com.example.demo.api.models.PersonATO;
import com.example.demo.models.dto.PersonDTO;
import com.example.demo.models.internal.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = AddressMapper.class)
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    Person fromATO(PersonATO person);

    PersonATO toATO(Person person);

    PersonDTO toDTO(Person person);

    Person fromDTO(PersonDTO person);
}
