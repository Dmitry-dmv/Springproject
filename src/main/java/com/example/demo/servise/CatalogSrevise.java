package com.example.demo.servise;

import com.example.demo.entity.Catalog;
import com.example.demo.entity.Customer;

import java.util.List;

public interface CatalogSrevise {
    void create(Catalog catalog);

    List<Catalog> readAll();

    boolean update(Customer customer, int id);

    boolean update(Catalog catalog, int id);

    boolean delete(int id);
}
