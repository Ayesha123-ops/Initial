package com.example.requestprocess.controller;

import com.example.requestprocess.dto.Student;
import com.example.requestprocess.service.Student_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Student_Controller {
    @Autowired
    private Student_Service service;
    @GetMapping("/students")
    public List<Student> show(){
        return service.showStudent();

    }
    @PostMapping("/add")
    public List<Student> add(@RequestBody Student student){
        return service.addStudent(student);
    }
    @PutMapping("/edit/{firstname}")
    public Student update(@PathVariable String firstname, @RequestBody Student student)
            {
                return service.putStudent(firstname, student);
            }
}
