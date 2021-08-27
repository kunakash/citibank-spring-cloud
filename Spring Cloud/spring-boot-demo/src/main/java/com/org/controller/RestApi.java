package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.CustomerDAO;

@RestController
@RequestMapping("api")
public class RestApi {
	@Autowired
	private CustomerDAO dao;
	
	@GetMapping
	public String hello() {
		return dao.fetch();
	}
	@PostMapping
	public String welcome() {
		return "Welcome to spring boot rest called via POST";
	}
	@PutMapping
	public String demo() {
		return "Welcome to spring boot rest called via PUT";
	}
	@DeleteMapping
	public String demo2() {
		return "Welcome to spring boot rest called via DELETE";
	}
}
