package com.example.studentcoursemanagementsystem8274.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentcoursemanagementsystem8274.entity.Student;
import com.example.studentcoursemanagementsystem8274.repository.StudentRepository;
import com.example.studentcoursemanagementsystem8274.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student addStudent(Student s) {
		// TODO Auto-generated method stub
		return studentRepository.save(s);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub
		return null;
	}

}
