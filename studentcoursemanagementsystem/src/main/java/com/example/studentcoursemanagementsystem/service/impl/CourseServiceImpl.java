package com.example.studentcoursemanagementsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentcoursemanagementsystem.entity.Course;
import com.example.studentcoursemanagementsystem.repository.CourseRepository;
import com.example.studentcoursemanagementsystem.service.CourseService;

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
		return courseRepository.findAll();
	}

	@Override
	public Course getCourseById(int id) {
		// TODO Auto-generated method stub
		return courseRepository.findById(id).get();
	}

	@Override
	public void deleteCourse(int id) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(id);

	}

	@Override
	public Course updateCourse(Course c) {
		// TODO Auto-generated method stub
		
		Course cour=courseRepository.findById(c.getCid()).get();
		cour.setCname(c.getCname());
		cour.setFees(c.getFees());
		return courseRepository.save(cour);
	}

	
}
