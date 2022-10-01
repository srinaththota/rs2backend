package com.rs2backend.service;

import java.util.List;

import com.rs2backend.entities.TransactionDetails;

public interface Transaction {
	
	public int purchase(int userid , int productid);
	List<TransactionDetails> viewTransactions(int userid);

}
