package com.shiro.studentsInfoSys;

import com.shiro.studentsInfoSys.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication

public class StudentsInfoSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsInfoSysApplication.class, args);
	}

}
