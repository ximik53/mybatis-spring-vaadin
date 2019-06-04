package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Company {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String geometry;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGeometry() {
        return geometry;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGeometry(String geometry) {
        this.geometry = geometry;
    }


}