package com.rs2backend.repository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rs2backend.entities.UserDetails;

@Repository
public class UserDetailsDaoImpl implements UserDetailsDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public UserDetails findByUsername(String username,String password){
		System.out.println(username);
		return (UserDetails) jdbcTemplate.queryForObject("select * from USER_DETAILS where username=? and password=?",new Object[] {username,password},new BeanPropertyRowMapper(UserDetails.class));
	}

}
