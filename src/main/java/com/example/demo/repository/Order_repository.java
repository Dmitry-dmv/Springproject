package com.example.demo.repository;

import com.example.demo.entity.ServiceOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Order_repository extends CrudRepository<ServiceOrder, Long> {
}
