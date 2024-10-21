package com.example.studentcoursemanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {

	@Id
	private int cid;
	private String cname;
	private int fees;
	
//	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
//	@JsonIgnore
//	List<Student> students;
}
