package com.example.expcond_rest_api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.expcond_rest_api.entities.person;
import com.example.expcond_rest_api.repositories.personR;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class personService {
    @Autowired
    personR per1;


    public ArrayList<person> getPersons(){
        return (ArrayList<person>) per1.findAll();
    }

    public Optional<person> getPerson(Long id){
        return per1.findById(id);
    }
}
