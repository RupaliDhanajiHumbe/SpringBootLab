package com.example.studentcoursemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentcoursemanagementsystem.entity.Course;


public interface CourseRepository extends JpaRepository<Course, Integer>{

}
