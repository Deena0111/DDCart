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

import com.ecommerce.DDCart.model.Category;
import com.ecommerce.DDCart.service.CategoryService;




@RestController
@CrossOrigin
@RequestMapping("/category")
public class CategoryControler {
	
	@Autowired
	CategoryService categoryService;
	
	
	@PostMapping("/create")
	public ResponseEntity<String> createCategory(@RequestBody Category category)
	{
		
		return new ResponseEntity<String>(categoryService.saveCategory(category),HttpStatus.OK);
	}
	
	
	@GetMapping("/list")
	public ResponseEntity<List<Category>> readAllCategory(){
		return new ResponseEntity<List<Category>>(categoryService.listCategory(),HttpStatus.OK);
	}
	
	

}
