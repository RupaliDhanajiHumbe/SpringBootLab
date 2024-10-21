package com.example.studentcoursemanagementsystem.service;

import java.util.List;

import com.example.studentcoursemanagementsystem.entity.Course;

public interface CourseService {
	
	public Course addCourse(Course c);

	public List<Course> getAllCourse();

	public Course getCourseById(int id);

	public void deleteCourse(int id);

	public Course updateCourse(Course c);

}
