package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student2;
import com.example.service.Student2Service;
import com.example.service.impl.Student2ServiceImpl;

@RestController
public class Student2Controller {
	
	@Autowired
	Student2ServiceImpl student2ServiceImpl;
	
	@PostMapping("/students")
	public Student2 addNewStudent(@RequestBody Student2 student)
	{
		return student2ServiceImpl.addStudent(student);
	}

	@GetMapping("/students2")
	public List<Student2> getStudent(){
		return student2ServiceImpl.getAllStudent();
	}
	
	@GetMapping("/student2/{id}")
	public Student2 getStudentById(@PathVariable int id) {
		return student2ServiceImpl.getStudentById(id);
	}
	
	@DeleteMapping("/student2/{id}")
	public String deleteStudent(@PathVariable int id) {
		   student2ServiceImpl.deleteStudent2(id);
		   return "Student is deleted";
	}
}
