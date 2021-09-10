//package com.example.demo.dto;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.hamcrest.Matchers;
//import org.junit.Before;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultHandler;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.ConfigurableMockMvcBuilder;
//import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SuppressWarnings("ALL")
//@SpringBootTest
//@AutoConfigureMockMvc
//public class CatalogDtoTest {
//    @Autowired
//    private ObjectMapper objectMapper;
//    @Autowired
//    private EmployeesDto repository;
//    @Autowired
//    private MockMvc mockMvc;
//    private WebApplicationContext webApplicationContext;
//    private Object CatalogDto;
//
//
//    @AfterEach
//    public void resetDb() {
//        repository.deleteAll();
//    }
//
//    @Test
//    @Before
//    public void setUp() {
//        ConfigurableMockMvcBuilder<DefaultMockMvcBuilder> builder =
//                MockMvcBuilders.webAppContextSetup(this.webApplicationContext);
//
//        this.mockMvc = builder.build();
//    }
//
//    @org.junit.Test
//    public void testCreate() throws Exception {
//        String uri = "/catalog";
//        CatalogDto= new CatalogDto();
//        Dto.setModelName("525");
//        Dto.setCarName("BMW");
//        Dto.setDescription("brakes");
//        Object dto = null;
//        String content = objectMapper.writeValueAsString(dto);
//        mockMvc.perform(post(uri).contentType(MediaType.APPLICATION_JSON).content(content))
//                .andDo(document(uri.replace("/", "\\")))
//                .andExpect(status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("modelName").value("2104"));
//    }
//
//    private ResultHandler document(String replace) {
//        return null;
//    }
//
//    @org.junit.Test
//    public void testGetById() throws Exception {
//        String uri = "/catalog/{id}";
//        mockMvc.perform(get(uri, 1).contentType(MediaType.APPLICATION_JSON))
//                .andDo(document(uri.replace("/", "\\")))
//                .andExpect(status().isOk());
//    }
//
//    @org.junit.Test
//    public void testGetAll() throws Exception {
//        String uri = "/catalog";
//        mockMvc.perform(get(uri).contentType(MediaType.APPLICATION_JSON))
//                .andDo(document(uri.replace("/", "\\")))
//                .andExpect(status().isOk());
//    }
//
//
//
//    @org.junit.Test
//    public void whenMethodArgumentMismatch_thenBadRequest() throws Exception {
//        String uri = "/catalog/{id}";
//        mockMvc.perform(get(uri, "blah-de-blah").contentType(MediaType.APPLICATION_JSON))
//                .andDo(document(uri.replace("/", "\\")))
//                .andExpect(status().isBadRequest())
//                .andExpect(MockMvcResultMatchers.jsonPath("errors", Matchers.contains("id should be of type java.util.Optional")));
//    }
//
//    @org.junit.Test
//    public void whenInternalException_thenBadRequest() throws Exception {
//        String uri = "/catalog/{id}";
//        Integer idToDelete = 20;
//        mockMvc.perform(delete(uri, idToDelete).contentType(MediaType.APPLICATION_JSON))
//                .andDo(document(uri.replace("/", "\\")))
//                .andExpect(status().isBadRequest())
//                .andExpect(MockMvcResultMatchers.jsonPath("errors", Matchers.contains("There is no such car!")));
//    }
//}