package com.rs2backend.models;

public class Transact {
 private int userid;
 private int productid;
 public Transact(int userid, int productid) {
	super();
	this.userid = userid;
	this.productid = productid;
}
public Transact() {
	super();
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
 
 
 
}
