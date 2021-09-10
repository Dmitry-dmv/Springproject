package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catalog")
public class Catalog_Controller {
    @GetMapping("/{name}")
    public String getSomeData(@PathVariable Integer id, @PathVariable Double price) {
        return "enter your name" + id;
    }
}
