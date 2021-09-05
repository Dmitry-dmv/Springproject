package com.example.demo.repository;

import com.example.demo.entity.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employees_repository extends CrudRepository<Employees ,Long> {
}
