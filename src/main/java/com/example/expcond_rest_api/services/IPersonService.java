package com.example.expcond_rest_api.services;

import com.example.expcond_rest_api.entities.person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;


public interface IPersonService {
    public Page<person> finPersonList(Pageable pageable);
    public person findPerson(Long id);
}
