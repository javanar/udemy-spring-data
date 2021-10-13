package com.ttuncer.udemy.springdata.product.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ttuncer.udemy.springdata.product.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

	
	
}
