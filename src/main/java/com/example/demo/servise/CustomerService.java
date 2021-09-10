package com.example.demo.servise;

import ch.qos.logback.core.joran.util.beans.BeanDescriptionFactory;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Employees;
import com.example.demo.repository.Customer_repository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class CustomerService implements CustomersServise {
    private static final Map<Integer, Customer> CLIENT_REPOSITORY_MAP = new HashMap<>();

    private static final AtomicInteger CLIENT_ID_HOLDER = new AtomicInteger();

    @Override
    public void create(Customer customer) {
        final int clientId = CLIENT_ID_HOLDER.incrementAndGet();
        customer.setId(customer.getId());
        CLIENT_REPOSITORY_MAP.put(clientId, customer);
    }
    @Override
    public List<Customer> readAll() {
        return new ArrayList<>(CLIENT_REPOSITORY_MAP.values());
    }

    @Override
    public Customer read(int id) {
        return CLIENT_REPOSITORY_MAP.get(id);
    }

    @Override
    public boolean update(Customer customer, int id) {
        if (CLIENT_REPOSITORY_MAP.containsKey(id)) {
            customer.setId((long) id);
            CLIENT_REPOSITORY_MAP.put(id, customer);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int id) {
        return CLIENT_REPOSITORY_MAP.remove(id) != null;
    }
}

