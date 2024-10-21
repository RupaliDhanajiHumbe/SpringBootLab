package com.example.studentcoursemanagementsystem8274.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentcoursemanagementsystem8274.entity.Student;
import com.example.studentcoursemanagementsystem8274.service.Impl.StudentServiceImpl;

import jakarta.validation.Valid;

@RestController
public class StudentController {

	@Autowired
	StudentServiceImpl studentServiceImpl;

	@PostMapping("/students")
	public ResponseEntity<Object> addNewStudent(@RequestBody @Valid Student s) {

		Student saveStudent = studentServiceImpl.addStudent(s);
		return new ResponseEntity<Object>(saveStudent, HttpStatus.OK);
	}

}
