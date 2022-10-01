package com.rs2backend.models;

public class ProductsDetails {

	private int id;
	private String ptype;
	private String name;
	private String description;
	
	public ProductsDetails(int id, String ptype, String name, String description) {
		super();
		this.id = id;
		this.ptype = ptype;
		this.name = name;
		this.description = description;
	}

	public ProductsDetails() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
