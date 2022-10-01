package com.rs2backend.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rs2backend.models.Transact;
import com.rs2backend.service.Transaction;
import com.rs2backend.util.JwtUtil;

@RestController
public class TransactionContoller {

	@Autowired
	Transaction transaction;
	
	@Autowired
	JwtUtil jwtUtil;
	
	@RequestMapping(value="/purchase",method=RequestMethod.POST)
	public ResponseEntity<?> purchaseProduct(@RequestBody  Transact transact,@RequestHeader Map<String, String> headers) {
		
		String Authtoken=headers.get("authorization");
		String token=Authtoken.substring(7);
		String username = jwtUtil.extractUsername(token);
		System.out.println("Username is "+username);
		String result="failure";
		if(username == null) {
			return ResponseEntity.ok(result);
		}
		int value=transaction.purchase(transact.getUserid(), transact.getProductid());
		
		if(value == 1) {
			result="success";
		}
		return ResponseEntity.ok(result);
	}
}
