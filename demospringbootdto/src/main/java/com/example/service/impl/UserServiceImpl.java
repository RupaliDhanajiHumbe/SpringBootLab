package com.example.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.UserDto;
import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public UserDto createUser(User user) {
		// TODO Auto-generated method stub
		User saveUser= userRepository.save(user);
		UserDto userDto=modelMapper.map(saveUser,UserDto.class);
		return userDto;
	}

	@Override
	public List<UserDto> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

	

}
