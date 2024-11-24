package com.example.spclProject2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.spclProject2.entity.employee;
@Repository
public interface dbrepo extends JpaRepository<employee, Integer>{

  

   
    
}
