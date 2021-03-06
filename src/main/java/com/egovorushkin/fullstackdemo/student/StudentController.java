package com.egovorushkin.fullstackdemo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(UUID.randomUUID(), "James", "Bond", "james.bond@gmail.com", Student.Gender.MALE),
                new Student(UUID.randomUUID(), "Elisa", "Tamara", "elisa.tamara@gmail.com", Student.Gender.FEMALE)
        );
    }
}
