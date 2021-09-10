package com.example.demo.web;

import com.example.demo.dto.CatalogDto;
import com.example.demo.service.ICatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController("/catalog")
public class Catalog_Controller {
       private final ICatalogService catalogService;
//
//
//    @GetMapping(path = "/{id}")
//    public @ResponseBody
//    String getById(@PathVariable Integer id) {
//        return "enter your username"+id;
//    }
//
//    @GetMapping(path = "/all")
//    public @ResponseBody
//    List<Catalog> getAll() {
//        return Catalog.getAll();
//    }

    @PostMapping
    public CatalogDto create(@RequestBody CatalogDto catalogDto) {
        return catalogService.create(catalogDto);
    }
//
//    @PutMapping
//    public Catalog update(@RequestBody Catalog dto) {
//        return Catalog.update(dto);
//    }
//
//    @DeleteMapping(path = "/{id}")
//    public @ResponseBody
//    String deleteById(@PathVariable Integer id) {
//        Catalog.deleteById(id);
//        return ControllerMessages.DELETED.name() + id;
//    }

}
