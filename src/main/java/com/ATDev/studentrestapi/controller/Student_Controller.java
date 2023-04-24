package com.ATDev.studentrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ATDev.studentrestapi.dto.Student;
import com.ATDev.studentrestapi.repository.StudentRepository;

@RestController
public class Student_Controller {

	@Autowired
	StudentRepository sr;
	
	@PostMapping("/savestudent")
	public String saveStudent(@RequestBody Student s) {
		sr.save(s);
		return "Student Saved";
	}
	
	@GetMapping("getstudent")
	public Student getStudentById(@RequestParam int id) {
		return sr.findById(id).get();
	}
	
	@PutMapping("/updatestudent")
	public String update(@RequestBody Student s) {
		sr.save(s);
		return "Student updated";
	}
	
	@DeleteMapping("/deletedata")
	public String deleteStudent(@RequestParam int id) {
		sr.deleteById(id);
		return "Student Deleted";
	}
	
}
