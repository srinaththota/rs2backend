package com.rs2backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.rs2backend.models.ProductsDetails;
import com.rs2backend.service.ProductService;

@RestController
public class ProductsController {

	@Autowired
	private ProductService productService;
	@CrossOrigin(origins={"*"})
	@RequestMapping(value="/getproducts",method=RequestMethod.GET)
	public List<ProductsDetails> listProducts() throws Exception{
		List<ProductsDetails> products=productService.getProducts();
		return products;
	}

}
