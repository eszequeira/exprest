package com.example.expcond_rest_api.services;

import com.example.expcond_rest_api.services.abstraction.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.expcond_rest_api.entities.person;
import com.example.expcond_rest_api.repositories.personR;
import org.springframework.transaction.annotation.Transactional;


@Service
public class personService implements IPersonService {
    @Autowired
    private personR per1;
    //Pageable pageable = PageRequest.of(0,5);
/*
    public ArrayList<person> getPersons(){
        return (ArrayList<person>) per1.findAll();
    }

    public Optional<person> getPerson(Long id){
        return per1.findById(id);
    }
*/
    @Override
    @Transactional(readOnly = true)
    public Page<person> finPersonList(Pageable pageable) {
        return per1.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public person findPerson(Long id) {
        return per1.findById(id).orElse(null) ;
    }
}
