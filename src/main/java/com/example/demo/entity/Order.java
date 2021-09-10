package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@Table(name="Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "address")
    private String address;

    public static List<Order> getAll() {
        return null;
    }
}
