package com.example.demo.servise;

import com.example.demo.entity.Employees;

import java.util.List;

public interface EmployeesServise {
    void create(Employees employees);

    List<Employees> readAll();

    Employees read(int id);

    boolean update(Employees employees, int id);

    boolean delete(int id);
}
