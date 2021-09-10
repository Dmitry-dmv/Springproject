package com.example.demo.repository;

import com.example.demo.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {

    List<Customer> findAllByFirstnameContainingIgnoreCaseAndLastnameIgnoreCase(String firstname, String lastname);

    Optional<Customer> findByEmailIgnoreCase(String email);

    List<Customer> findAllByEmailContainingIgnoreCase(String email);

    List<Customer> findAllByPhoneNumber(String phoneNumber);

}
