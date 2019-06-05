package com.example;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class Control {
    public Control(){

    }
    private CompanyService service;

    Control(CompanyService repository) {
        this.service = repository;
    }

    @GetMapping("/")
    List<Company> findAll() {
        return service.findAll();
    }

}