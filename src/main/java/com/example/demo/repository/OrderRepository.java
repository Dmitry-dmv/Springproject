package com.example.demo.repository;

import com.example.demo.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findAllByCustomer_id(Long id);

    List<Order> findAllByTimeBetween(LocalDateTime start, LocalDateTime end);
}
