package com.example.expcond_rest_api.services;

import com.example.expcond_rest_api.entities.Person;
import com.example.expcond_rest_api.repositories.PersonRepository;
import com.example.expcond_rest_api.services.abstraction.IPersonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService implements IPersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Person> findPersonList(Pageable pageable) {
        return personRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Person findPerson(Long id) {
        return personRepository.findById(id).orElse(null);
    }

}
