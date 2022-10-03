package com.example.requestprocess.service;

import com.example.requestprocess.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class Student_Service<student> {
    private List<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Azhar","Siraj","ISB"),
            new Student("omer","farooq","RWP")
    ));
    public List<Student> showStudent(){
        return students;
    }

public List<Student> addStudent(Student student){
        students.add(student);
        return students;
    }
    public Student putStudent(String name,Student student){
        Optional<Student> optionalStudent = students.stream().filter(student1 -> student1.getFirstName().equals(name)).findFirst();

        if(!optionalStudent.isPresent()){
            throw new RuntimeException("Invalid Student");
        }else{
            Student std = optionalStudent.get();
            std.setAddress(student.getAddress());
            std.setFirstName(student.getFirstName());
            std.setLastname(student.getLastname());
            return std;
        }
    }
}
