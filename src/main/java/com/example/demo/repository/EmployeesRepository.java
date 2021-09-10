package com.example.demo.repository;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeesRepository extends CrudRepository<Employees,Long> {
    List<Employees> findAllByFirstnameContainingIgnoreCaseAndLastnameContainingIgnoreCase(String firstname, String lastname);

}
