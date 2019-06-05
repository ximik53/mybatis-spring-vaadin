package com.example;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    public CompanyService(){

    }

    private CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

}
