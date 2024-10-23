package com.example.service;

import java.util.List;

import com.example.dto.UserDto;
import com.example.entity.User;

public interface UserService {

	public UserDto createUser(User user);

	public List<UserDto> getAllUser();

	public UserDto getUserById(int id);

	public void deleteUser(int id);
}
