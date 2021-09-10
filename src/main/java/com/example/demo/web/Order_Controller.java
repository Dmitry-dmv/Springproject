package com.example.demo.web;


import com.example.demo.entity.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class Order_Controller {
    @GetMapping("/{name}")
    public String getSomeData(@PathVariable Integer id, @PathVariable String login, @PathVariable String name) {
        return "enter your username" + id;
    }
    @GetMapping("/address")
    public List<Order> getAll() {
        return Order.getAll();
    }
}
