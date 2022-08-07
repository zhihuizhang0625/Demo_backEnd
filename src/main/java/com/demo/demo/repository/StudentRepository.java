package com.demo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
    
}
