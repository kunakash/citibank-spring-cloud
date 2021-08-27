package com.org.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.Employee;

@RestController
@RequestMapping("api")
public class RestApi {

	@GetMapping
	public String greet() {
		return "Welcome to REST API";
	}
	@GetMapping(value = "/fetch", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee find() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Alex");
		emp.setSalary(35200);
		return emp;
	}
	@GetMapping(value = "/fetch/{id}/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee findById(@PathVariable("id") int employeeId, @PathVariable("name") String employeeName) {
		Employee emp = new Employee();
		emp.setId(employeeId);
		emp.setName(employeeName);
		emp.setSalary(35200);
		return emp;
	}
}
