package com.example.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Student2;
import com.example.repository.Student2Repository;
import com.example.service.Student2Service;

@Service
public class Student2ServiceImpl implements Student2Service {

	Student2Repository studentRepository;
	
	@Override
	public Student2 addStudent(Student2 student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student2> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	
	@Override
	public Student2 getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudent2(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

	@Override
	public Student2 updateStudent(Student2 student) {
		// TODO Auto-generated method stub
		return null;
	}

}
