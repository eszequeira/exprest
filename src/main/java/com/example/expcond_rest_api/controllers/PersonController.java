package com.example.expcond_rest_api.controllers;

import com.example.expcond_rest_api.entities.Person;
import com.example.expcond_rest_api.services.PersonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/persons")
public class PersonController {

    private final PersonService personService;

    Pageable pageable = PageRequest.of(0, 5);

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public Page<Person> getPersons() {
        return personService.finPersonList(pageable);
    }

    @GetMapping({"{id}"})
    public Person getPerson(@PathVariable(name = "id") String id) {
        return personService.findPerson(Long.parseLong(id));
    }

}
