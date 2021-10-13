package com.ttuncer.udemy.springdata.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ttuncer.udemy.springdata.product.entities.Product;
import com.ttuncer.udemy.springdata.product.repositories.ProductRepository;

@SpringBootTest
class ProductdataApplicationTests {
	
	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate() {
		Product product = new Product();
		product.setId(4);
		product.setName("Fourth Product");
		product.setDesc("Example Product");
		product.setPrice(8200d);
		
		productRepository.save(product);
	}
	
	@Test
	public void testRead() {
		Product product = productRepository.findById(4).orElseThrow(IllegalArgumentException::new);
		System.out.println(product.getName());
	}
	
	@Test
	public void testUpdate() {
		Product product = productRepository.findById(2).orElseThrow(IllegalArgumentException::new);
		product.setDesc("Another example product");
		productRepository.save(product);
	}
	
	@Test
	public void testDelete() {
		if (productRepository.existsById(5)) {			
			productRepository.deleteById(5);
		}
	}
	
	@Test
	public void testCount() {
		System.out.println("Number of records in product table: " + productRepository.count());
	}
	
}
