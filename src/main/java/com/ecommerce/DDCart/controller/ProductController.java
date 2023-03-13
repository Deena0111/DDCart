package com.ecommerce.DDCart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.DDCart.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/product/")
public class ProductController {
	
	@Autowired
	ProductService productService;

}
