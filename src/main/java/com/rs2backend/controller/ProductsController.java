package com.rs2backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.rs2backend.models.Products;

import com.rs2backend.service.ProductService;

@RestController
public class ProductsController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/getproducts",method=RequestMethod.GET)
	public List<Products> listProducts() throws Exception{
		List<Products> products=productService.getProducts();
		products.stream().forEach(i->System.out.println(i.getName()));
		return products;
	}

	private ResponseEntity<List<Products>> ResponseEntity(List<Products> products) {
		// TODO Auto-generated method stub
		return null;
	}
}
