package com.example.studentcoursemanagementsystem.service;

import java.util.List;

import com.example.studentcoursemanagementsystem.entity.Student;

public interface StudentService {
	
	public Student addStudent(Student s);

	public List<Student> getAllStudent();

	public Student getStudentById(int id);

	public void deleteStudent(int id);

	public Student updateStudent(Student s);

}
