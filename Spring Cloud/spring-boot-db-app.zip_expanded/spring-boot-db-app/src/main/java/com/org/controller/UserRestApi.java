package com.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.dao.UserRepository;
import com.org.entities.User;

@RestController
@RequestMapping("userApi")
public class UserRestApi {

	@Autowired
	private UserRepository dao;
	
	@GetMapping
	public List<User> findAllUsers() {
		List<User> users = dao.findAll();
		return users;
	}
	@PostMapping
	public User createUser(@RequestBody User user) { 
		User createdUser = dao.save(user); // saved on User table
		return createdUser; 
	}
	@GetMapping("{id}")
	public User findUser(@PathVariable("id") int userId) {
		User user = dao.findById(userId).get();
		return user;
	}
}
