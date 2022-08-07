package com.demo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import com.apple.eawt.event.SwipeListener;
import com.demo.demo.model.Student;
import com.demo.demo.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService{
    
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student saveStudent(Student student) {
        // TODO Auto-generated method stub
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        // TODO Auto-generated method stub
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(String username) {
        // TODO Auto-generated method stub
        if (username == null){
            return null;
        }
        List<Student> list = getAllStudents();
        for (Student x: list) {
            if (x != null && x.getUsername() != null && x.getUsername().equals(username)){
            
                return x;
            }
        }
        return null;
    }

    // @Override
    // public boolean isCorrect(String username, String password) {
    //     // TODO Auto-generated method stub
    //     return false;
    // }

    // @Override
    // public boolean isUserPresent(Student student) {
    //     // TODO Auto-generated method stub
    //     boolean userExists = false;
    //     Student existingUser = studentRepository.findByUsername(student.getUsername());
    //     if(existingUser!=null){
    //         userExists = true;
    //     }
    //     return userExists;
        
    // }
    @Override
    public boolean isCorrect(String username, String password) {
        // TODO Auto-generated method stub
        System.out.println(getAllStudents());
        boolean userCorrect = false;
        Student existingUser = getStudent(username);
        if(existingUser!=null && existingUser.getPassword().equals(password)){
            userCorrect = true;
        }
        
        return userCorrect;
        
    }
    

}