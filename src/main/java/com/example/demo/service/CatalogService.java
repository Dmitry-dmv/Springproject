package com.example.demo.service;

import com.example.demo.dto.CatalogDto;
import com.example.demo.entity.Catalog;
import com.example.demo.repository.CatalogRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@RequiredArgsConstructor
@Service
public class CatalogService implements ICatalogService {

    private final CatalogRepository catalogRepository;
    private final ObjectMapper objectMapper;

    @Override
    public CatalogDto create(CatalogDto catalog) {
        Catalog entity=objectMapper.convertValue(catalog,Catalog.class);
        entity.setId(null);
        entity=catalogRepository.save(entity);
        return objectMapper.convertValue(entity,CatalogDto.class);
    }

    @Override
    public List<CatalogDto> getAll() {
        return null;
    }

    @Override
    public CatalogDto getById(long id) {
        return null;
    }

    @Override
    public CatalogDto findAllByNameIgnoreCase(String name) {
        return null;
    }

    @Override
    public CatalogDto findAllByNameContainingIgnoreCase(String name) {
        return null;
    }

    @Override
    public CatalogDto findAllByNameContainsIgnoreCaseAndPriceBetween(String name, Long min, Long max) {
        return null;
    }

    @Override
    public CatalogDto update(CatalogDto catalog) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
