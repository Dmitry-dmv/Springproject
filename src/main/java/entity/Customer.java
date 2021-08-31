package entity;

import dto.CustomerDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;


@Entity(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String lastname;
    private Long id;

    public Customer() {
    }

    public static List<Customer> getAll() {
        return null;
    }

    public static Customer create(CustomerDto dto) {
        return null;
    }

    public static void delete(Integer id) {
    }

    public static void create(String yriy, String petrov, int i) {
    }

    public static void create(String s, String bmw, String cool_modern_car, int i) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
