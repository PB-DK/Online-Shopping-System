package com.onlineshopping.shoppingcart;


public class ShoppingCartService {

	ShoppingCartRepository shoppingCartRepository;
	
	public void add( ShoppingCart shoppingCart ) {
		shoppingCartRepository.save(shoppingCart);
	}
	
	public void remove( String item ) {
		shoppingCartRepository.deleteById(item); 
	}
	
	
}
