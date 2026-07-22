package com.example.campuscore.service;

import org.springframework.stereotype.Service;
import com.example.campuscore.entity.Student;
import com.example.campuscore.repository.StudentRepo;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo){
        this.studentRepo = studentRepo;
    }

    public Student creatStudent(Student student){
        return studentRepo.save(student);
    }

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }
}