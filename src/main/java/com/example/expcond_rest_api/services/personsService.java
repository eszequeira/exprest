package com.example.expcond_rest_api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.expcond_rest_api.entities.persons;
import com.example.expcond_rest_api.repositories.personsR;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class personsService {
    @Autowired
    personsR per1;


    public ArrayList<persons> getPersons(){
        return (ArrayList<persons>) per1.findAll();
    }

    public Optional<persons> getPerson(Long id){
        return per1.findById(id);
    }
}
