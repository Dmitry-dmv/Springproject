package com.example.demo.servise;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Employees;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class EmployeesService implements EmployeesServise {
    private static final Map<Integer, Employees> EMPLOYEES_REPOSITORY_MAP = new HashMap<>();

    private static final AtomicInteger EMPLOYEES_ID_HOLDER = new AtomicInteger();

    @Override
    public void create(Employees employees) {
        final int clientId = EMPLOYEES_ID_HOLDER.incrementAndGet();
        employees.setId(employees.getId());
        EMPLOYEES_REPOSITORY_MAP.put(clientId, employees);
    }
    @Override
    public List<Employees> readAll() {
        return new ArrayList<>(EMPLOYEES_REPOSITORY_MAP.values());
    }

    @Override
    public Employees read(int id) {
        return EMPLOYEES_REPOSITORY_MAP.get(id);
    }

    @Override
    public boolean update(Employees employees, int id) {
        if (EMPLOYEES_REPOSITORY_MAP.containsKey(id)) {
            employees.setId((long) id);
            EMPLOYEES_REPOSITORY_MAP.put(id,employees);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int id) {
        return EMPLOYEES_REPOSITORY_MAP.remove(id) != null;
    }
}
