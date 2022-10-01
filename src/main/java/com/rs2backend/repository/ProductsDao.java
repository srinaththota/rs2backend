package com.rs2backend.repository;

import java.util.List;

import com.rs2backend.models.Products;

public interface ProductsDao {

	List<Products> getProducts();
}
