package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.org.CustomerDAO;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		// create beans.xml -> mention component-scan base-package
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml")
		// ctx.getBean("customerDAO");
		
		SpringApplication.run(MainApp.class, args);
	}
	
	@Bean
	public CommandLineRunner runner(ApplicationContext context) {
		return args -> {
			CustomerDAO dao = (CustomerDAO)context.getBean("customerDAO");
			dao.store();
		};
	}
}
