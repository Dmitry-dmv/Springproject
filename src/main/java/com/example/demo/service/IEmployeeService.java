package com.example.demo.service;

import com.example.demo.dto.EmployeesDto;

import java.util.List;

public interface IEmployeeService {
    EmployeesDto create (EmployeesDto employees);

    List<EmployeesDto>getAll();

    EmployeesDto getById(long id);

    EmployeesDto findAllByFirstnameContainingIgnoreCaseAndLastnameContainingIgnoreCase(String firstname, String lastname);
}
