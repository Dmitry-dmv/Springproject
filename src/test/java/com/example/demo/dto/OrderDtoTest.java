package com.example.demo.dto;

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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class OrderDtoTest {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private EmployeesDto repository;
    @Autowired
    private MockMvc mockMvc;
    private Object Name;
    private Object EmployeesDto;
    private Object OrderDto;

    @AfterEach
    public void resetDb() {
        repository.deleteAll();
    }

    @Test
    public void givenPerson_whenAdd_thenStatus201andPersonReturned() throws Exception {
        OrderDto  = new OrderDto();
        Object order = null;
        mockMvc.perform(
                post("/order")
                        .content(objectMapper.writeValueAsString(order))
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andExpect(status().isCreated())
                .andExpect((ResultMatcher) jsonPath("$.id").isNumber())
                .andExpect((ResultMatcher) jsonPath("$.name").value("Sergey"));
    }
    @Test
    public void whenInternalException_thenBadRequest() throws Exception {
        String uri = "/order/{id}";
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