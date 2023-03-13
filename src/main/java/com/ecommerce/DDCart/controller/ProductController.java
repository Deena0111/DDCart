package com.ecommerce.DDCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.DDCart.model.Product;
import com.ecommerce.DDCart.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/product/")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/create")
	public ResponseEntity<String> createCategory(@RequestBody Product product)
	{
		
		return new ResponseEntity<String>(productService.saveCategory(product),HttpStatus.OK);
	}
	
	
	@GetMapping("/list")
	public ResponseEntity<List<Product>> readAllCategory(){
		return new ResponseEntity<List<Product>>(productService.listCategory(),HttpStatus.OK);
	}

}
