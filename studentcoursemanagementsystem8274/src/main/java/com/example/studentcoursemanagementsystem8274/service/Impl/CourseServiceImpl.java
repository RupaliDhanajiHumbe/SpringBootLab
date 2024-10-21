package com.example.studentcoursemanagementsystem8274.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentcoursemanagementsystem8274.entity.Course;
import com.example.studentcoursemanagementsystem8274.repository.CourseRepository;
import com.example.studentcoursemanagementsystem8274.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired

	CourseRepository courseRepository;

	@Override
	public Course addCourse(Course c) {
		// TODO Auto-generated method stub
		return courseRepository.save(c);
	}

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getCourseById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCourse(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Course updateCourse(Course c) {
		// TODO Auto-generated method stub
		return null;
	}

}
