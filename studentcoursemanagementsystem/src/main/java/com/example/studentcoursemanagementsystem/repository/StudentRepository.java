package com.example.studentcoursemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentcoursemanagementsystem.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{

}
