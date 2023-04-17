package com.onlineshopping.shoppingcart;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onlineshopping.customer.Customer;

public class ShoppingController {

	private ShoppingCartService shoppingCartService;
	
	@RequestMapping(method=RequestMethod.POST, value=
	"/customer/{customerId}/shoppingCart")
	public void add(@RequestBody ShoppingCart shoppingCart, @PathVariable String item ) {
		shoppingCart.setCustomer(new Customer(item, ""));
		shoppingCartService.add(shoppingCart);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value=
	"/customer/{customerId}/shoppingCart/{item}")
	public void remove( @PathVariable String item ) {
		shoppingCartService.remove(item);
		
	}
	
	
}

/* 
 
  	@RequestMapping(method=RequestMethod.POST, value=
	"/customer/{customerId}/shoppingCart/{shoppingCartId}/productId/{item}")
	public void add(@RequestBody ShoppingCart shoppingCart, @PathVariable String item ) {
		shoppingCart.setProduct(productId, "", "");
		shoppingCartService.add(item);
	}  
  
  	@RequestMapping(method=RequestMethod.DELETE, value=
	"/customer/{customerId}/shoppingCart/{shoppingCartId}/productId/{item}")
	public void remove( @PathVariable String item ) {
		shoppingCartService.remove(item);
		
	}
  
 */








