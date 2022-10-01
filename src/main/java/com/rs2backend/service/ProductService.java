package com.rs2backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs2backend.models.Products;
import com.rs2backend.repository.ProductsDao;

@Service
public class ProductService {

	@Autowired
	private ProductsDao productsDao;
	public List<Products> getProducts(){
	return	productsDao.getProducts();
	}
}
