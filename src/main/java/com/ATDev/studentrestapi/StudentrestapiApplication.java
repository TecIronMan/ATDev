package com.ATDev.studentrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ATDev.studentrestapi.controller.Student_Controller;
import com.ATDev.studentrestapi.dto.Student;


@SpringBootApplication(scanBasePackages = "com.ATDev.studentrestapi.controller")
@EntityScan(basePackages ="com.ATDev.studentrestapi.dto")
@EnableJpaRepositories(basePackages = "com.ATDev.studentrestapi.repository")
public class StudentrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentrestapiApplication.class, args);
		
	
	}

}
