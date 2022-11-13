package com.example.expcond_rest_api.services;

import com.example.expcond_rest_api.persistence.factory.PersonEntityFactory;
import com.example.expcond_rest_api.persistence.repositories.PersonRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonServiceTest {

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonRepository personRepository;

    @BeforeAll
    void insertTestData() {
        var john = PersonEntityFactory.build(1L, "John", "Doe");
        personRepository.save(john);

        var jane = PersonEntityFactory.build(2L, "Jane", "Doe");
        personRepository.save(jane);
    }

    @Test
    public void givenMeasurementService_whenTemperatureEvent_thenIsCorrectlyProcessed() {
        var person = personService.findPerson(1L);
        var personName = person.getNOMBRE();

        assertThat(personName).isEqualTo("John");
    }

    @Test
    public void givenMeasurementService_whenObjectPresentEvent_thenIsCorrectlyProcessed() {
        var pageable = mock(Pageable.class);
        var allItems = personService.findPersonList(pageable);

        assertThat(allItems.getTotalElements()).isEqualTo(2);
    }

}
