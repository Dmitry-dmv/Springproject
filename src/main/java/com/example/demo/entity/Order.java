package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private LocalDateTime time;//TODO посмотреть аннотацию

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Employees employee;

    //TODO посмотреть параметры для аннотации ManyToMany с catalog


}
