package com.sda.springdemojavaee14.homework.annotation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // generates all getters/setters, toString(), equals(), hashCode()
@AllArgsConstructor // generates constructor for all fields in order of their declaration
@NoArgsConstructor // generates default constructor
@Builder
public class Person {

    private String name;

    private String surname;

    private int age;
}
