package com.onlineshopping.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.product.Product;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customers/{name}")
	public void addCustomer(@PathVariable Customer customer) {
		customerService.addCustomer(customer);
	}
	
	@RequestMapping("/customers/{name}")
	public void deleteCustomer(@PathVariable String name) {
		customerService.deleteCustomer(name);
	}
	
	/*
	@RequestMapping(method=RequestMethod.POST, value="/customer/{name}")				//  @RequestMapping("/customers/{name}")
	public void logout(@PathVariable Product name) {
		customerService.addLogin(name);		
	}
	*/
	@RequestMapping(method=RequestMethod.POST, value="/customers/{customerName}/product/{product}")
	public void selectProduct( @RequestBody Product product) {
		customerService.selectProduct(product);
	}
}		
	




//	customer.setProduct(new Product(name, "", ""));

		/*
		@RequestMapping("/customers")
		public List<Product> getAllCustomers() {
			return customerService.getAllCustomers();
		}*/	
		
		/*	@RequestMapping("/customers")
		public void logout() {
			//customerRepository.exit();
		}*/
		
		
		//customer.addProduct(new Product(productId, "", ""));
		//customerService.findByName(name);       //.findById(name);

