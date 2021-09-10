//package com.example.demo.web;
//
//import com.example.demo.entity.Catalog;
//import org.hibernate.engine.spi.Status;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//public class Catalog_Controller {
//    private Status ControllerMessages;
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
//
//    @PostMapping
//    public Catalog create(@RequestBody Catalog dto) {
//        return Catalog.create(dto);
//    }
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
//
//}
