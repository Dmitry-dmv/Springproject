package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="Catalog")
public class Catalog {
    @javax.persistence.Id
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "prise")
    private Double prise;
    @Column(name = "image")
    private String image;

    public static List<Catalog> getAll() {
        return null;
    }

    public static Catalog create(Catalog dto) {
        return dto;
    }

    public static Catalog update(Catalog dto) {
        return dto;
    }

    public static void deleteById(Integer id) {
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}





