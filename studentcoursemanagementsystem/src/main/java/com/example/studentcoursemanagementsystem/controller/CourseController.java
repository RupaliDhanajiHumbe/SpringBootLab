package com.example.studentcoursemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentcoursemanagementsystem.entity.Course;
import com.example.studentcoursemanagementsystem.service.impl.CourseServiceImpl;

@RestController
public class CourseController {

	@Autowired

	CourseServiceImpl courseServiceImpl;

	@PostMapping("/courses")
	public Course addNewCourse(@RequestBody Course c) {
		return courseServiceImpl.addCourse(c);

	}
	
	@GetMapping("/courses")
	public List<Course> getCourseAll(){
		return courseServiceImpl.getAllCourse();
	}
	
	@GetMapping("courses/{id}")
	public Course getCourseById(@PathVariable int id) {
		return courseServiceImpl.getCourseById(id);
	}
	
	@DeleteMapping("courses/{id}")
	public String deleteCourseById(@PathVariable int id) {
		 courseServiceImpl.deleteCourse(id);
		 return "delete successfully";
	}
	/*
	 * @PutMapping("course/{id}")
	 *  public Course updateCourse(@RequestBody Course cou) {
	 *  return courseServiceImpl.updateCourse(cou);
	 * }
	 */
}
