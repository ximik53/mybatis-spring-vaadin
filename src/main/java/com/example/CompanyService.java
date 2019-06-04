package com.example;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {

    @Select("SELECT * FROM company ORDER BY id")
    List<Company> findAll();

    @Update("UPDATE company SET name = #{name}, geometry = #{geometry} WHERE id = #{id}")
    void update(Company company);

}
