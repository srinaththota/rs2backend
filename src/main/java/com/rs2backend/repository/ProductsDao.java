package com.rs2backend.repository;

import java.util.List;
import com.rs2backend.models.ProductsDetails;

public interface ProductsDao {

	List<ProductsDetails> getProducts();
}
