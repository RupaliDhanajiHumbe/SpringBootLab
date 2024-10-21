package com.example.studentcoursemanagementsystem8274.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
	@NotEmpty(message = "Please enter the name")
	@Size(min = 2, max = 50, message = "please enter proper name")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "Accept only alphbates")
	@Column(length = 50)
	private String cname;
	private int fees;
	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	@JsonIgnore
	List<Student> students;

}
