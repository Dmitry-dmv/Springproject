package com.example.demo.web;


import com.example.demo.entity.ServiceOrder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class Order_Controller {
    @GetMapping("/{name}")
    public String getSomeData(@PathVariable Integer id, @PathVariable String login) {
        return "enter your username" + id;
    }
    @GetMapping("/address")
    public List<ServiceOrder> getAll() {
        return ServiceOrder.getAll();
    }
}
