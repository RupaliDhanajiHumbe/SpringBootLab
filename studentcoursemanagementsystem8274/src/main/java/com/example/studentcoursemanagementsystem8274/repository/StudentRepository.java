package com.example.studentcoursemanagementsystem8274.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentcoursemanagementsystem8274.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
