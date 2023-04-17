package com.onlineshopping.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.product.Product;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void deleteCustomer(String name) {
		customerRepository.deleteById(name);	//.deleteById(id);
	}
	
	public void selectProduct(Product product) {
		customerRepository.save(product);  //.save(product);
	}
	
	
	
/*
	public void login(String name) {
		customerRepository.findById(name);	  			//findById(name);   //.findById(name);		
	}
	
	public void logout(Product name) {
		customerRepository.	//.findById(name);   //.findById(name);		
	}
	
//	public void logout() {
	//	customerRepository.exit();
	//}
/*/	

}


