package com.example.demo.servise;

import com.example.demo.entity.Customer;

import java.util.List;

public interface CustomersServise {
    void create(Customer customer);

    List<Customer> readAll();

    Customer read(int id);

    boolean update(Customer customer, int id);

    boolean delete(int id);
}
