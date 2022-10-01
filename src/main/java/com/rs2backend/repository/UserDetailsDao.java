package com.rs2backend.repository;

import java.util.List;

import com.rs2backend.entities.UserDetails;


public interface UserDetailsDao{

	public UserDetails findByUsername(String username,String password);
}
