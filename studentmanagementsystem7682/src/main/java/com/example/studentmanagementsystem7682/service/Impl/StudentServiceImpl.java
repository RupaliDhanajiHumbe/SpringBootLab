package com.example.studentmanagementsystem7682.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentmanagementsystem7682.entity.Student;
import com.example.studentmanagementsystem7682.repository.StudentRepository;
import com.example.studentmanagementsystem7682.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired

	StudentRepository studentRepository;

	@Override
	public Student addNewStudent(Student s) {
		// TODO Auto-generated method stub
		return studentRepository.save(s);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

	@Override
	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub

		Student _st = studentRepository.findById(s.getSid()).get();
		_st.setSname(s.getSname());
		_st.setMarks(s.getMarks());

		return studentRepository.save(_st);
	}

	@Override
	public List<Student> searchByName(String name) {
		// TODO Auto-generated method stub
		return studentRepository.findBySname(name);
	}

}
