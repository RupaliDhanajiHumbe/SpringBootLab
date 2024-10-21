package com.example.studentcoursemanagementsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentcoursemanagementsystem.entity.Student;
import com.example.studentcoursemanagementsystem.repository.StudentRepository;
import com.example.studentcoursemanagementsystem.service.StudentService;

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
		Student st = studentRepository.findById(s.getSid()).get();
		st.setSname(s.getSname());
		st.setScontact(s.getScontact());
		st.setSemail(s.getSemail());

		return studentRepository.save(st);
	}

}
