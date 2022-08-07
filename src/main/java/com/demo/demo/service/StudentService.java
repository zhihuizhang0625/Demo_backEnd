package com.demo.demo.service;

import java.util.List;

import com.demo.demo.model.Student;


public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public boolean isCorrect(String username, String password);
    public Student getStudent(String username);
}
