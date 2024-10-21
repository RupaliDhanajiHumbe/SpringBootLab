package com.example.studentcoursemanagementsystem8274.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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
public class Student {
	@Id

	private int sid;
	@NotEmpty(message = "Please enter the name")
	@Size(min = 2, max = 30, message = "please enter proper name")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "Accept only alphbates")
	@Column(length = 40)
	private String sname;
	@NotEmpty(message = "Phone Number can't be empty!")
	@Size(min = 10, max = 10, message = "Invalid Phone Number please enter a vaild phone number minimum of 10 digits")
	@Pattern(regexp = "^\\d{10}$", message = "Invalid input:Enter 10 digit numbers only")
	@Column(unique = true, length = 20)
	private String scontact;
	@NotEmpty(message = "must include email ")

	@NotBlank(message = "must type Value in email of doctor")
	@Email(message = "Invalid email of doctor")
	@Column(unique = true, length = 80)
	private String semail;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "c_id")
	Course course;

}
