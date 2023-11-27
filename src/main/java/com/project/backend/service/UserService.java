package com.project.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.backend.model.User;

@Service
public interface UserService {

	//create users
	public User createUser(User user);
	
	//get users
	public List<User> getUsers();
	
	//read users by Id
	public User getUserById(int id);
	
	//delete user by Id
	public void deleteUser(int id); 
	
	//update user by Id
	public User updateUser(User user, int id);
	
}
