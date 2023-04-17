package com.onlineshopping.customer;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.onlineshopping.product.Product;

public interface CustomerRepository extends CrudRepository<Customer, String> {

	public List<Product> save(Product product);
	
	//void save(Product product);


}
