package com.example.demo.models.dto;

import com.example.demo.models.internal.Address;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class PersonDTO {

    private String id;
    private String firstname;
    private String lastname;
    private Address address;
}
