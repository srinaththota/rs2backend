package com.rs2backend.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rs2backend.models.Products;

@Repository
public class ProductsDaoImpl implements ProductsDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Products> getProducts() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from PRODUCT_DETAILS", new BeanPropertyRowMapper(Products.class));
	}

}
