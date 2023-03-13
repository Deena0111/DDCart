package com.ecommerce.DDCart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ecommerce.DDCart.model.Product;

public interface ProductRepository extends MongoRepository<Product, Integer>{

}
