//package com.example.demo.service;
//
//import com.example.demo.entity.Customer;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.atomic.AtomicInteger;
//
//@Service
//public class CustomerService implements ICustomersService {
//    private static final Map<Integer, Customer> CLIENT_REPOSITORY_MAP = new HashMap<>();
//
//    private static final AtomicInteger CLIENT_ID_HOLDER = new AtomicInteger();
//
//    @Override
//    public void create(Customer customer) {
//        final int clientId = CLIENT_ID_HOLDER.incrementAndGet();
//        customer.setId(customer.getId());
//        CLIENT_REPOSITORY_MAP.put(clientId, customer);
//    }
//    @Override
//    public List<Customer> readAll() {
//        return new ArrayList<>(CLIENT_REPOSITORY_MAP.values());
//    }
//
//    @Override
//    public Customer read(int id) {
//        return CLIENT_REPOSITORY_MAP.get(id);
//    }
//
//    @Override
//    public boolean update(Customer customer, int id) {
//        if (CLIENT_REPOSITORY_MAP.containsKey(id)) {
//            customer.setId((long) id);
//            CLIENT_REPOSITORY_MAP.put(id, customer);
//            return true;
//        }
//
//        return false;
//    }
//
//    @Override
//    public boolean delete(int id) {
//        return CLIENT_REPOSITORY_MAP.remove(id) != null;
//    }
//}
//
