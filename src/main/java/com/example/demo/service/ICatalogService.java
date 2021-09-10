package com.example.demo.service;

import com.example.demo.dto.CatalogDto;

import java.util.List;

public interface ICatalogService {
    CatalogDto create(CatalogDto catalog);

    List<CatalogDto> getAll();

    CatalogDto getById(long id);

    CatalogDto findAllByNameIgnoreCase(String name);

    CatalogDto findAllByNameContainingIgnoreCase(String name);

    CatalogDto findAllByNameContainsIgnoreCaseAndPriceBetween(String name, Long min, Long max);

    CatalogDto update(CatalogDto catalog);

    void delete(long id);
}
