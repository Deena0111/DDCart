package com.ecommerce.DDCart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.DDCart.model.Product;
import com.ecommerce.DDCart.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepo;
	
	public String saveCategory(Product product)
	{
		productRepo.save(product);
		return product.toString()+"  created sucessfully";
	}

	
	public List<Product> listCategory() {
		return productRepo.findAll();
	}
	

}
