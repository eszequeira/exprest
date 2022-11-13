package com.example.expcond_rest_api.persistence.factory;

import com.example.expcond_rest_api.persistence.entities.Person;

public class PersonEntityFactory {

    public static Person build(Long id, String firstName, String lastName) {
        return Person.builder()
                .IDPERSONA(id)
                .NOMBRE(firstName)
                .APELL1(lastName)
                .build();
    }

}
