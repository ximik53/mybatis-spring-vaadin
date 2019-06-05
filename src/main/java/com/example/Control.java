package com.example;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
class Control {
    public Control() {

    }

    CompanyService service;

    @Autowired

    public Control(CompanyService repository) {
        this.service = repository;

    }

    @GetMapping("/search")
    List<Company> find() {
        return service.findAll();

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Company> findPoly(@RequestParam String names) {
        return service.findAllPoly(names);

    }
}


