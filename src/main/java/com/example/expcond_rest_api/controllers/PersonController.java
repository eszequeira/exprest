package com.example.expcond_rest_api.controllers;

import com.example.expcond_rest_api.entities.Person;
import com.example.expcond_rest_api.services.abstraction.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/persons")
public class PersonController {

    @Autowired
    private IPersonService personService;
    Pageable pageable = PageRequest.of(0, 5);

    @GetMapping
    public Page<Person> getPersons() {
        return personService.finPersonList(pageable);
    }

    @GetMapping({"{id}"})
    public Person getPerson(@PathVariable(name = "id") String id) {
        return personService.findPerson(Long.parseLong(id));
    }

}
