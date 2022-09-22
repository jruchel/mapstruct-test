package com.example.demo.models.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class AddressDTO {

    private String country;
    private String street;
    private String streetNumber;
    private String zipCode;
}
