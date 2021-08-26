package com.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dao.CustomerDao;
@Service
public class CustomerService {
	// injects CustomerDao object
	@Autowired
	private CustomerDao customerDao;

	public CustomerService() {
		System.out.println("CustomerService created");
	}
	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	public void register() {
		customerDao.storeCustomer();
		System.out.println("register() in Service is called");
	}
}
