package com.example.demo.models.internal;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Address {

    private String country;
    private String street;
    private String streetNumber;
    private String zipCode;
}
