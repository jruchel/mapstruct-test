package com.example.demo.models.internal;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Person {

    private String id;
    private String firstname;
    private String lastname;
    private Address address;
}
