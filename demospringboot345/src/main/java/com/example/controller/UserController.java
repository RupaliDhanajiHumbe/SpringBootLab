package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.impl.UserServiceImpl;

@RestController
public class UserController {
	@Autowired
	UserServiceImpl userService;

	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@PostMapping("/users")
	public User addNewUser(@RequestBody User user) {
		
		return userService.addUser(user);
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id) {
		
	       return userService.getUserById(id);
	}
	
	@DeleteMapping("/users/{id}")
	public String deletUser(@PathVariable int id) {
		
		return  userService.deletExistingUser(id);
	}

}
