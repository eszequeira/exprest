package com.example.expcond_rest_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.expcond_rest_api.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
}
