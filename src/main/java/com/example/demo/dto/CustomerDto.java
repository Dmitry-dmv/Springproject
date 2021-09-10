package com.example.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class CustomerDto {
    private Long id;
    private String name;
    private String lastname;
    private String email;
    private List<Integer>customerList;

}
