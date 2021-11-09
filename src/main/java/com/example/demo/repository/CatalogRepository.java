package com.example.demo.repository;

import com.example.demo.entity.Catalog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogRepository extends CrudRepository<Catalog ,Long> {

    List<Catalog> findAllByNameIgnoreCase(String name);

    List<Catalog> findAllByNameContainingIgnoreCase(String name);

    List<Catalog> findAllByNameContainsIgnoreCaseAndPriceBetween(String name, Long min, Long max);

    
      List<Catalog> findAllByPriceGreaterThanEqual(Long price);

      List<Catalog> findAllByPriceLess(Long price);

     List<Catalog> findAllByPriceBetweenOrPriceEquals(Long start, Long end);


}
