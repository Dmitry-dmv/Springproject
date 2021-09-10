package com.example.demo.dto;


import lombok.Data;

import java.util.List;

@Data
public class CatalogDto {
    private Long id;
    private String name;
    private Double prise;
    private String image;
    private List<Integer>catalogList;
}
