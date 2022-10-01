package com.rs2backend.models;

public class UserAuth {

	private String username;
	private String password;
	
	public UserAuth(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public UserAuth() {
		super();
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
