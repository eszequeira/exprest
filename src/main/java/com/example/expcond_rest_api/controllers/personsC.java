package com.example.expcond_rest_api.controllers;

import com.example.expcond_rest_api.entities.persons;
import com.example.expcond_rest_api.services.personsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class personsC {
    @Autowired
    personsService personsService;
/*
    public ArrayList<persons> getPersons(){
        return personsService.getPersons();
    }

    @GetMapping("/{id}")
    public Optional<persons> getPerson(@PathVariable("id") int id){
        return personsService.getPerson(id);
    }
    @GetMapping("/{id}")
    public ResponseEntity<persons> getPerson(@PathVariable(name = "id") String id){
        Optional<persons> pe=personsService.getPerson(Long.parseLong(id));
        return new ResponseEntity(pe, HttpStatus.OK);
    }
    */
    @GetMapping({"{id}"})
    public ResponseEntity<persons> getPerson(@PathVariable(name = "id") String id){
        Optional<persons> pe=personsService.getPerson(Long.parseLong(id));
        return new ResponseEntity(pe, HttpStatus.OK);
    }
}
