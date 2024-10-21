package com.example.studentcoursemanagementsystem8274.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentcoursemanagementsystem8274.entity.Course;
import com.example.studentcoursemanagementsystem8274.service.Impl.CourseServiceImpl;

import jakarta.validation.Valid;

@RestController
public class CourseController {

	@Autowired

	CourseServiceImpl courseServiceImpl;

	@PostMapping("/courses")
	public Course addNewCourse(@RequestBody @Valid Course c) {
		return courseServiceImpl.addCourse(c);

	}

}
