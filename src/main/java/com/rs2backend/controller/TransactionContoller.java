package com.rs2backend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rs2backend.models.Transact;
import com.rs2backend.service.Transaction;

@RestController
public class TransactionContoller {

	@Autowired
	Transaction transaction;
	
	@RequestMapping(value="/purchase",method=RequestMethod.POST)
	public ResponseEntity<?> purchaseProduct(@RequestBody  Transact transact) {
		System.out.println("reched");
		int value=transaction.purchase(transact.getUserid(), transact.getProductid());
		String result="failure";
		if(value == 1) {
			result="success";
		}
		return ResponseEntity.ok(result);
	}
}
