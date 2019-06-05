package com.example;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Service;

@RestController
class Control {
    public Control(){

    }
    private final CompanyService repository;

    Control(CompanyService repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    List<Company> findAll() {
        return repository.findAll();
    }

}