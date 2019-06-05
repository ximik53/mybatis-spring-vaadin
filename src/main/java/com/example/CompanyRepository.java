package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    @Query(
            value = "SELECT id, name  FROM company WHERE ST_Contains(ST_GeomFromText(\'POLYGON((?1))\'), company.geometry);",
            nativeQuery = true)
    List<Company> findAllPoly(String names);
}

