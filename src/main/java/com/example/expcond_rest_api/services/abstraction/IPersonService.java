package com.example.expcond_rest_api.services.abstraction;

import com.example.expcond_rest_api.entities.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IPersonService {

    Page<Person> findPersonList(Pageable pageable);

    Person findPerson(Long id);

}
