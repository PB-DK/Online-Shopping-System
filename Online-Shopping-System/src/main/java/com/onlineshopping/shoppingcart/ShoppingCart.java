package com.onlineshopping.shoppingcart;

import com.onlineshopping.customer.Customer;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class ShoppingCart {
	
	@Id
	private String items;

	@ManyToOne
	public Customer customer;
	

	public ShoppingCart() {
		
	}
	
	public ShoppingCart(String items, String customerId) {
		super();
		this.items = items;
		this.customer = new Customer(customerId, "");
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
