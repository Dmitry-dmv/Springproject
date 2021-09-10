package com.example.demo.servise;

import com.example.demo.entity.Catalog;
import com.example.demo.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class CatalogService implements CatalogSrevise {
    private static final Map<Integer, Catalog> CATALOG_REPOSITORY_MAP = new HashMap<>();

    private static final AtomicInteger CATALOG_ID_HOLDER = new AtomicInteger();

    @Override
    public void create(Catalog catalog) {
        final int clientId = CATALOG_ID_HOLDER.incrementAndGet();
        catalog.setId(catalog.getId());
        CATALOG_REPOSITORY_MAP.put(clientId, catalog);
    }
    @Override
    public List<Catalog> readAll() {
        return new ArrayList<>(CATALOG_REPOSITORY_MAP.values());
    }

    @Override
    public boolean update(Customer customer, int id) {
        return false;
    }

    public Catalog read(int id) {
        return CATALOG_REPOSITORY_MAP.get(id);
    }

    @Override
    public boolean update(Catalog catalog, int id) {
        if (CATALOG_REPOSITORY_MAP.containsKey(id)) {
            catalog.setId((long) id);
            CATALOG_REPOSITORY_MAP.put(id, catalog);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int id) {
        return CATALOG_REPOSITORY_MAP.remove(id) != null;
    }
}
