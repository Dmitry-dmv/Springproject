package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Employees employee;

    //TODO посмотреть параметры для аннотации ManyToMany с catalog


}
