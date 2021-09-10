package com.example.demo.dto;

import com.example.demo.repository.EmployeesRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SuppressWarnings("ALL")
@SpringBootTest
@AutoConfigureMockMvc
public class EmployeesDtoTest {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private EmployeesRepository repository;
    @Autowired
    private MockMvc mockMvc;
    private Object Name;
    private Object EmployeesDto;

    @AfterEach
    public void resetDb() {
        repository.deleteAll();
    }

    @Test
    public void givenPerson_whenAdd_thenStatus201andPersonReturned() throws Exception {
        EmployeesDto person = new EmployeesDto("Michail");
        mockMvc.perform(
                post("/persons")
                        .content(objectMapper.writeValueAsString(person))
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andExpect(status().isCreated())
                .andExpect((ResultMatcher) jsonPath("$.id").isNumber())
                .andExpect((ResultMatcher) jsonPath("$.name").value("Michail"));
    }


    @Test
    public void givenId_whenGetExistingPerson_thenStatus200andPersonReturned() throws Exception {
        long id = createTestPerson("Michail");
        mockMvc.perform(
                get("/persons/{id}", id))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) jsonPath("$.id").value(id))
                .andExpect((ResultMatcher) jsonPath("$.name").value("Michail"));
    }

    private long createTestPerson(String michail) {
        return 0;
    }

    @Test
    public void givePerson_whenUpdate_thenStatus200andUpdatedReturns() throws Exception {
        long id = createTestPerson("Nick");
        mockMvc.perform(
                get("/persons/{id}", id)
                        .content(objectMapper.writeValueAsString(new EmployeesDto("Michail")))
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) jsonPath("$.id").value("1"))
                .andExpect((ResultMatcher) jsonPath("$.name").value("Michail"));

    }
    @Test
    public void whenInternalException_thenBadRequest() throws Exception {
        String uri = "/employees/{id}";
        Integer idToDelete = 20;
        mockMvc.perform(MockMvcRequestBuilders.delete(uri, idToDelete).contentType(MediaType.APPLICATION_JSON))
                .andDo(document(uri.replace("/", "\\")))
                .andExpect(status().isBadRequest())
                .andExpect(MockMvcResultMatchers.jsonPath("errors", Matchers.contains("There is no such employees !")));
    }

    private ResultHandler document(String replace) {
        return null;
    }
}

