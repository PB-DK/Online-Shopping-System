package com.onlineshopping.product;

import com.onlineshopping.shoppingcart.ShoppingCart;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	private String name;
	private String price;
	private String quantityAvailable;
	
	@ManyToOne
	public ShoppingCart shoppingCart;


	public Product() {
		
	}
	
	public Product(String name, String price, String quantityAvailable, String item){
		super();
		this.name = name;
		this.price = price;
		this.quantityAvailable = quantityAvailable;
		this.shoppingCart = new ShoppingCart(item, "");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(String quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}	
	
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
}	


	
					//, String shoppingCartId) {
	
	//	this.shoppingCart = new ShoppingCart(shoppingCartId, "", "");

	
/*	
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	*/
	
	
	
