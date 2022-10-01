package com.rs2backend.service;

import com.rs2backend.entities.UserDetails;

public interface LoginService {

	public UserDetails findUser(String username,String password);
}
