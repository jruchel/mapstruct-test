package com.example.demo.mappers;

import com.example.demo.api.models.AddressATO;
import com.example.demo.models.dto.AddressDTO;
import com.example.demo.models.internal.Address;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    AddressDTO toAddressDTO(Address address);

    AddressATO toAddressATO(Address address);

    Address fromAddressATO(AddressATO addressATO);

    Address fromAddressDTO(AddressDTO addressDTO);
}
