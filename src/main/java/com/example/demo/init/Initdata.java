package com.example.demo.init;

import ch.qos.logback.core.joran.util.beans.BeanDescriptionFactory;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Employees;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
@RequiredArgsConstructor
public class Initdata {
//    public final Customer customer;
//    public final Employees employees;
    @PostConstruct
    public void init() {
        BeanDescriptionFactory customer = null;
        Employees.create("Yriy", "Petrov", 31);
        Employees.create("Yriy", "Minin", 29);


        Customer.create("318", "BMW", "generator", 1);
        Customer.create("Qutlander", "Mitchubisi", "pads", 2);

    }

}
