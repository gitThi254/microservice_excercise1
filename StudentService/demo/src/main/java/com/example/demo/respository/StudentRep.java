package com.example.demo.respository;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRep extends JpaRepository<Student, Integer> {
}
