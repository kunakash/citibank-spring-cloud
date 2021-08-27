package com.org;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAO {

	public CustomerDAO() {
		System.out.println("CustomerDAO created");
	}
	
	public void store() {
		System.out.println("store() inside CustomerDAO");
	}
	
	public String fetch() {
		return "Fetch methods called";
	}
}
