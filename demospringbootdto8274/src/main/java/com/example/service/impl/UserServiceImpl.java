package com.example.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.dto.UserDto;
import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public UserDto createUser(User user) {
		// TODO Auto-generated method stub
		User saveUser = userRepository.save(user);
		UserDto userDto = modelMapper.map(saveUser, UserDto.class);
		return userDto;

	}

//	@Override
//	public UserDetails loadUserByUsername(String username) {
//		User user = userRepository.findByUsername(username);
//
//		if (user == null) {
//			throw new UserNotFoundException("User is not available in database");
//		}
//		return new UserPrincipal(user);
//
//	}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.findByUsername(username);
		// return user.map(UserPrincipal::new).orElseThrow(() -> new
		// UsernameNotFoundException("user not found"));
		if (user == null)
			throw new UsernameNotFoundException("User 403");
		return new UserPrincipal(user);

	}

	@Override
	public List<UserDto> getAllUser() {
		// TODO Auto-generated method stub
		List<User> users = userRepository.findAll();
		return users.stream().map((user) -> modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
	}

	@Override
	public UserDto getUserById(int id) {
		// TODO Auto-generated method stub
		User user1 = userRepository.findById(id).get();
		UserDto userDto1 = modelMapper.map(user1, UserDto.class);
		return userDto1;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	// TODO Auto-generated method stub

}
