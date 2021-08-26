package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNewApproach {

	public static void main(String[] args) {
		// We need to initialize the spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		Identifier identifier = (Identifier) context.getBean("b1");
		identifier.display();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
