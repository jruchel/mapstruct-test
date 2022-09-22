package com.example.demo.api.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class PersonATO {

    private String firstname;
    private String lastname;
    private AddressATO address;
}
