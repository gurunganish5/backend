package com.project.backend.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.backend.model.User;
import com.project.backend.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ClientController {


	@Autowired
	private UserService userService;

	//hello world
	@GetMapping("/")
	public String helloWorld() {
		return "Hello World!";
	}

	//create user
	@PostMapping("/add")
	public String addUser(@RequestBody User user) {
		userService.createUser(user);
		return "User Added Successfully";
	}

	//read users
	@GetMapping("/users")
	public List<User> getUsers(){
		System.out.println("Users...");
		return userService.getUsers();
	}

	//get User by ID
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable("id") int id) {
		return userService.getUserById(id);
	}


	//update User by ID
	@PutMapping("/update/{id}")
	public String updateUserById(@RequestBody User user,@PathVariable("id") int id) {
		 userService.updateUser(user, id);
		 return "User Updated Successfully";
	}

	//delete user by ID
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		userService.deleteUser(id);
		return "User Deleted Successfully";
	}






}
