package com.example.demo.service;

import com.example.demo.dto.CustomerDto;
import com.example.demo.dto.OrderDto;
import com.example.demo.entity.Order;

import java.time.LocalDateTime;
import java.util.List;

public interface IOrderService {
    Order create (CustomerDto order);

    List<OrderDto> getAll();

    OrderDto getById(long id);

    OrderDto findAllByCustomer_id(Long id);

    OrderDto indAllByTimeBetween(LocalDateTime start, LocalDateTime end);
}
