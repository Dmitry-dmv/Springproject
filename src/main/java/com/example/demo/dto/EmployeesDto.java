package com.example.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class EmployeesDto {
    private String name;
    private String lastname;
    private Long id;
    private List<Integer> employeesList;
}
