package com.example.service;

import java.util.List;

import com.example.entity.Student2;

public interface Student2Service {
	
	public Student2 addStudent(Student2 student);
	
	public List<Student2> getAllStudent();
	
	public Student2 getStudentById(int id);
	
	public void deleteStudent2(int id);
    
	public Student2 updateStudent(Student2 student);
}