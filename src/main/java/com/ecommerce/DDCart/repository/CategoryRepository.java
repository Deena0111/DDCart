package com.ecommerce.DDCart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.ecommerce.DDCart.model.Category;


public interface CategoryRepository extends MongoRepository<Category, Integer>{

}
