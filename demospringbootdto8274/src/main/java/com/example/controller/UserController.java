package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.UserDto;
import com.example.entity.User;
import com.example.service.impl.UserServiceImpl;

@RestController

public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@PostMapping("/users")
	public UserDto addUser(@RequestBody User user) {

		String password = user.getPassword();
		String bpaasword = passwordEncoder.encode(password);
		user.setPassword(bpaasword);
		return userServiceImpl.createUser(user);

	}

	@GetMapping("/users")
	public List<UserDto> getAllUser() {
		return userServiceImpl.getAllUser();
	}

	@GetMapping("/users/{id}")
	public UserDto getUserById(@PathVariable int id) {
		return userServiceImpl.getUserById(id);
	}

	@DeleteMapping("/users/{id}")
	public String deleteUserById(@PathVariable int id) {
		userServiceImpl.deleteUser(id);
		return "User is deleted";
	}

}
