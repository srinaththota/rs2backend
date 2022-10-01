package com.rs2backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rs2backend.models.AuthResponse;
import com.rs2backend.models.UserAuth;
import com.rs2backend.entities.UserDetails;
import com.rs2backend.service.LoginService;
import com.rs2backend.util.JwtUtil;



@RestController
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@Autowired
	JwtUtil jwtTokenUtil;
	
	@RequestMapping(value="/authenticate",method=RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody UserAuth req)throws Exception{
	
		System.out.println("username is "+req.getUsername());
		System.out.println("username is "+req.getPassword());
		UserDetails userDetails = loginService.findUser(req.getUsername(), req.getPassword());
		
		
		final String jwt = jwtTokenUtil.generateToken(userDetails);
		
		return ResponseEntity.ok(new AuthResponse(jwt));
		
	}
}
