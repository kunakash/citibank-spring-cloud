package com.org.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataSource {
	@Value("jdbc:dummy:ip:port")
	private String url;
	@Value("admin")
	private String username;
	@Value("admin123")
	private String password;
	public DataSource() {
		System.out.println("DataSource created");
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
