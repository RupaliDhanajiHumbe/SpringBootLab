package com.example.service;

import java.util.List;

import com.example.entity.User;

public interface UserService {

	public User addUser(User user);

	public List<User> getUsers();

	public User getUserById(int id);

	public String deletExistingUser(int id);

}
