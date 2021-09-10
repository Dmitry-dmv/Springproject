package com.example.demo.service;

import com.example.demo.dto.CustomerDto;

import java.util.List;

public interface ICustomersService {
    CustomerDto create (CustomerDto customer);

    List<CustomerDto> getAll();

    CustomerDto getById(long id);

    CustomerDto findAllByFirstnameContainingIgnoreCaseAndLastnameIgnoreCase(String firstname, String lastname);

    CustomerDto findByEmailIgnoreCase(String email);

    CustomerDto findAllByEmailContainingIgnoreCase(String email);

    CustomerDto findAllByPhoneNumber(String phoneNumber);
}
