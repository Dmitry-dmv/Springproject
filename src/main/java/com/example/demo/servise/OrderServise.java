package com.example.demo.servise;

import com.example.demo.entity.Order;

import java.util.List;

public interface OrderServise {
    void create(Order order);

    List<Order> readAll();

    Order read(int id);

    boolean update(Order order, int id);

    boolean delete(int id);
}
