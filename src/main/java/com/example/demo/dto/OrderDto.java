package com.example.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderDto {
    private String name;
    private String lastname;
    private Long id;
    private String address;
    private List<Integer>orderList;

}
