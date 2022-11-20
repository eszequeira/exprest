package com.example.expcond_rest_api.http.controllers.v1;

import com.example.expcond_rest_api.persistence.entities.Person;
import com.example.expcond_rest_api.services.PersonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class PersonControllerV1 {

    private final PersonService personService;
    Pageable pageable = PageRequest.of(0, 5);

    public PersonControllerV1(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(path = "/persons", produces = "application/json")
    public Page<Person> getPersons() {
        return personService.findPersonList(pageable);
    }

    @GetMapping(path = "/persons/{id}", produces = "application/json")
    public Person getPerson(@PathVariable(name = "id") Long id) {
        return personService.findPerson(id);
    }

}
