package com.example.expcond_rest_api.services.abstraction;

import com.example.expcond_rest_api.entities.person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IPersonService {

    Page<person> finPersonList(Pageable pageable);

    person findPerson(Long id);

}
