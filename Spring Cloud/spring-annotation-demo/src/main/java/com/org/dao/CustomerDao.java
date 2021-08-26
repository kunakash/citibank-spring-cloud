package com.org.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {

	// DAO depends on DataSource
	@Autowired
	private DataSource datasource;
	
	public CustomerDao() {
		System.out.println("CustomerDao created");
	}

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
	
	public void storeCustomer() {
		System.out.println("Url: "+datasource.getUrl());
		System.out.println("storeCustomer() in DAO is called");
	}
}
