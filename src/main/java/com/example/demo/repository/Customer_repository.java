package com.example.demo.repository;

import com.example.demo.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Customer_repository extends CrudRepository<Customer,Long> {
}
