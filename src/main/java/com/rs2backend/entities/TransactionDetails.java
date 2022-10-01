package com.rs2backend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRANSACTION_DETAILS")
public class TransactionDetails {

	@Id
	@GeneratedValue
	private int id;
	private int userId;
	private int productId;
	
	
	public TransactionDetails() {
		super();
	}


	public TransactionDetails(int id, int userId, int productId) {
		super();
		this.id = id;
		this.userId = userId;
		this.productId = productId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
	
}
