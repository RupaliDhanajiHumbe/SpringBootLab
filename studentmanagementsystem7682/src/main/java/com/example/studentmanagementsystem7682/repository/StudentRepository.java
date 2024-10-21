package com.example.studentmanagementsystem7682.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentmanagementsystem7682.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	public List<Student> findBySname(String name);

}
