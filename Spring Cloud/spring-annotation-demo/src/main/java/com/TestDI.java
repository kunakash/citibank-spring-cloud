package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.dao.CustomerDao;
import com.org.dao.DataSource;
import com.org.service.CustomerService;

public class TestDI {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CustomerService service = (CustomerService)context.getBean("customerService");
		service.register();
		((ClassPathXmlApplicationContext)context).close();
	}

}
