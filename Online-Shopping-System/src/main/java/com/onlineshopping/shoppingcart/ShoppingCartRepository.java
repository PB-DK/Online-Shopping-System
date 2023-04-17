package com.onlineshopping.shoppingcart;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, String> {

	public List<ShoppingCart> findByItem(String item);
}
