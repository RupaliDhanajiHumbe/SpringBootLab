package com.example.studentmanagementsystem7682.service;

import java.util.List;

import com.example.studentmanagementsystem7682.entity.Student;

public interface StudentService {

	public Student addNewStudent(Student s);

	public List<Student> getAllStudent();

	public Student getStudentById(int id);

	public List<Student> searchByName(String name);

	public void deleteStudent(int id);

	public Student updateStudent(Student s);

}
