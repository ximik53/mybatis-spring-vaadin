package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class Control {
    public Control(){

    }
    CompanyService service;
@Autowired
    public Control(CompanyService repository) {
        this.service = repository;
    }

    @GetMapping("/")
    List<Company> find() {
        return service.findAll();
    }

}