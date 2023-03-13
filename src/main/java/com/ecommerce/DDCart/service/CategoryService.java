package com.ecommerce.DDCart.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.DDCart.model.Category;
import com.ecommerce.DDCart.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepo;
	
	
	public String saveCategory(Category category)
	{
		categoryRepo.save(category);
		return category.toString()+"  created sucessfully";
	}

	
	public List<Category> listCategory() {
		return categoryRepo.findAll();
	}
}
