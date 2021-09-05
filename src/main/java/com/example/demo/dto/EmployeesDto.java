package com.example.demo.dto;

import lombok.Data;

@Data
public class EmployeesDto {
    private String name;
    private String lastname;
    private Long id;

    public EmployeesDto(String michail) {
    }

    public void deleteAll() {
    }

    public CustomerDto save(CustomerDto emp) {
        return emp;
    }
}
