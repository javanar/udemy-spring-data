package com.ttuncer.udemy.springdata.customer.repository;

import org.springframework.data.repository.CrudRepository;

import com.ttuncer.udemy.springdata.customer.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
