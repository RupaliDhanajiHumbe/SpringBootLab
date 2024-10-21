package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static List<User> users = new ArrayList<>();
	static int count = 5;
	static {
		users.add(new User(1, "Avinash"));
		users.add(new User(2, "Ashwini"));
		users.add(new User(3, "Neha"));
		users.add(new User(4, "Pragati"));
		users.add(new User(5, "Aiman"));

	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		user.setId(++count);

		users.add(user);
		return user;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		
		for(User user1:users) {
			if(user1.getId()==id) {
				return user1;	
			}
		}
		
		return null;
	}

	@Override
	public String deletExistingUser(int id) {
		// TODO Auto-generated method stub
		
		for(User user1:users)
		{
			if(user1.getId()==id)
			{
				users.remove(user1);
			    return "user is delete";
			}
		}
		return "User is not exist";	
	}
}
