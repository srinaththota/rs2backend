package com.rs2backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rs2backend.entities.TransactionDetails;
import com.rs2backend.repository.TransactionDao;;

@Component
public class TransactionImpl implements Transaction {
	
	@Autowired
	TransactionDao transactionDao;

	@Override
	public int purchase(int userid,int productid) {
		// TODO Auto-generated method stub
	return	transactionDao.insertTransactions(userid,productid);
		
	}

	@Override
	public List<TransactionDetails> viewTransactions(int customerid) {
		// TODO Auto-generated method stub
		return null;
	}

}
