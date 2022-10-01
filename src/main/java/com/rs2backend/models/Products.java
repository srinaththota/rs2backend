package com.rs2backend.models;

public class Products {

	private int id;
	private String type;
	private String name;
	private String desc;
	
	public Products(int id, String type, String name, String desc) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.desc = desc;
	}

	public Products() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
