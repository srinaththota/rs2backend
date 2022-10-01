package com.rs2backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs2backend.entities.UserDetails;
import com.rs2backend.repository.UserDetailsDao;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	UserDetailsDao userDetailsDao;
	@Override
	public UserDetails findUser(String username, String password) {
		// TODO Auto-generated method stub
		return userDetailsDao.findByUsername(username, password);
		
	}

}
