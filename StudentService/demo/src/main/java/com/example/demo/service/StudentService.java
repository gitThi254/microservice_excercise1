package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.respository.StudentRep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRep studentRep;
    public Student getStudentById(int id) {
       return studentRep.findById(id).get();
    }
    public Student save(Student student) {
        return studentRep.save(student);
    }
}
