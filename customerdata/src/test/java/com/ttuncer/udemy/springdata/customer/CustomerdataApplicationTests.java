package com.ttuncer.udemy.springdata.customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ttuncer.udemy.springdata.customer.entity.Customer;
import com.ttuncer.udemy.springdata.customer.repository.CustomerRepository;

@SpringBootTest
class CustomerdataApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testCreate() {
		
		Customer customer = new Customer();
		customer.setId(2);
		customer.setName("adesso");
		customer.setEmail("age@sa.com.tr");
		
		customerRepository.save(customer);
	}
	
	@Test
	public void testRead() {
		
		Customer customer = customerRepository.findById(1).orElseThrow(IllegalArgumentException::new);
		System.out.println("Name of the selected customer is: " + customer.getName());
	}
	
	@Test
	public void testUpdate() {
		
		Customer customer = customerRepository.findById(2).orElseThrow(IllegalArgumentException::new);		
		customer.setEmail("adesso.com.tr");
		customerRepository.save(customer);
	}

	@Test
	public void testDelete() {
		
		if (customerRepository.existsById(5)) {
			customerRepository.deleteById(5);
		}
	}
	
	@Test
	public void testCount() {
		
		System.out.println("Number of records in customer table is: " + customerRepository.count());
	}
}
