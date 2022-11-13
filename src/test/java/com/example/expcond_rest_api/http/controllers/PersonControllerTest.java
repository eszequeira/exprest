package com.example.expcond_rest_api.http.controllers;

import com.example.expcond_rest_api.services.PersonService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PersonController.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonControllerTest {

    private static final String ENDPOINT_SLUG = "/v1/persons/";
    private MockMvc mockMvc;

    @MockBean
    private PersonService personService;

    @BeforeAll
    void setup(WebApplicationContext webApplicationContext) {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void givenMockMVC_whenAppContextLoaded_willHaveValidMockedService() {
        assertThat(personService).isNotNull();
    }

    @Test
    public void givenMockMVC_whenRequestingWrongEndpoint_willReturnNotFound() throws Exception {
        mockMvc.perform(get("/dummy"))
                .andExpect(status().is(HttpStatus.NOT_FOUND.value()));
    }

    @Test
    public void givenMockMVC_whenSendingWrongData_willReturnUnprocessable() throws Exception {
        mockMvc.perform(get(ENDPOINT_SLUG + "/dummy"))
                .andExpect(status().is(HttpStatus.UNPROCESSABLE_ENTITY.value()));
    }

    @Test
    public void givenMockMVC_whenSendingEmptyRequest_willReturnOk() throws Exception {
        mockMvc.perform(get(ENDPOINT_SLUG))
                .andExpect(status().is(HttpStatus.OK.value()));
    }

    @Test
    public void givenMockMVC_whenSendingIdRequest_willReturnOk() throws Exception {
        mockMvc.perform(get(ENDPOINT_SLUG + "/5"))
                .andExpect(status().is(HttpStatus.OK.value()));
    }

}
