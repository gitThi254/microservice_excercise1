package com.example.demo.controller;

import com.example.demo.model.Library;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;
    private final RestTemplate restTemplate;

    public StudentController(StudentService studentService, RestTemplate restTemplate) {
        this.studentService = studentService;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id) {
        Library library = restTemplate.getForObject("http://localhost:9092/library/" + id, Library.class);
        Student student = studentService.getStudentById(id);
        student.setLibrary(library);
      return  student;
  }
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.save(student);
    }
}
