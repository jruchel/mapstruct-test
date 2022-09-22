package com.example.demo.api.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class AddressATO {

    private String country;
    private String street;
    private String streetNumber;
    private String zipCode;
}
