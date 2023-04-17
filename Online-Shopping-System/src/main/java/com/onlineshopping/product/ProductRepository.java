package com.onlineshopping.product;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, String> {

	public List<Product> findByShoppingCartId(String shoppingCartIditem);
}												//item
