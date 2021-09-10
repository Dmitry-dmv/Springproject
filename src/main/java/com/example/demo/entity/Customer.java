package com.example.demo.entity;


import com.example.demo.dto.CustomerDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "Customer")
public class Customer {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "email")
    private String email;


    public static Customer create(CustomerDto dto) {
        return null;
    }

    public static List<Customer> getAll() {
        return null;
    }

    public static void delete(Integer id) {
    }
}


