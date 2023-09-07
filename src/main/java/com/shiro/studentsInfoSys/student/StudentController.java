package com.shiro.studentsInfoSys.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents(){
        return List.of(
                new Student(1L,
                        "Shiro",
                        LocalDate.of(1999, 1, 24),
                        "shiro@gmail.com",
                        24)
        );
    }
}
