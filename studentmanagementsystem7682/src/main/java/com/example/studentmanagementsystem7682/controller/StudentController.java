package com.example.studentmanagementsystem7682.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentmanagementsystem7682.entity.Student;
import com.example.studentmanagementsystem7682.service.Impl.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	StudentServiceImpl studentServiceImpl;

	@PostMapping("/students")
	public Student addStudent(@RequestBody Student s) {

		return studentServiceImpl.addNewStudent(s);

	}

	@GetMapping("/students")
	public List<Student> getStudents() {

		return studentServiceImpl.getAllStudent();

	}

	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id) {
		return studentServiceImpl.getStudentById(id);
	}

	@GetMapping("/student/{name}")
	public List<Student> getStudentById(@PathVariable String name) {
		return studentServiceImpl.searchByName(name);
	}

	@DeleteMapping("/students/{id}")
	public String deleteStudentById(@PathVariable int id) {
		studentServiceImpl.deleteStudent(id);
		return "Student is deleted";
	}

	@PutMapping("/students")
	public Student updatStudent(@RequestBody Student s) {
		return studentServiceImpl.updateStudent(s);
	}
}
