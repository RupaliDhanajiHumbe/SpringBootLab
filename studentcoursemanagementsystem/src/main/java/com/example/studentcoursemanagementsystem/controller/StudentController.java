package com.example.studentcoursemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentcoursemanagementsystem.entity.Student;
import com.example.studentcoursemanagementsystem.service.impl.StudentServiceImpl;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	
	@Autowired
	StudentServiceImpl studentServiceImpl;

	@PostMapping("/students")
	public Student addNewStudent(@RequestBody Student s) {
		// studentServiceImpl.addStudent(s)
		return s;
	}
	
	@GetMapping("/students")
	public List<Student> getStudentAll(){
		return studentServiceImpl.getAllStudent();
		
	}
	
	@GetMapping("students/{id}")
	public Student getStudentById(@PathVariable int id) {
		return studentServiceImpl.getStudentById(id);
		
	}
	
	@DeleteMapping("students/{id}")
		public String deleteStudentById(@PathVariable int id) {
		studentServiceImpl.deleteStudent(id);
		return "delete succefully";
	}
	

}