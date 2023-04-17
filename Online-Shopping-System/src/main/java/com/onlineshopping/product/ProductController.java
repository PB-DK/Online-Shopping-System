package com.onlineshopping.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.onlineshopping.shoppingcart.ShoppingCart;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(
	"/customers/{customerId}/shoppingCart/{shoppingCartId}/products/{productName}")
	public Object order(@PathVariable String name) {
		return productService.order(name);		
	}	
	
	@RequestMapping(method=RequestMethod.PUT, value=
	"/customers/{customerId}/shoppingCart/{shoppingCartId}/products/{price}")
	public void changePrice(@RequestBody Product product, 
			@PathVariable String shoppingCartId, @PathVariable String price ) {
		product.setShoppingCart(new ShoppingCart(shoppingCartId, ""));
		productService.changePrice(product);
	}	
}








/*	
@RequestMapping(method = RequestMethod.POST, value ="/products/{name}")
public void getProduct(@PathVariable String name) {
	productService.getProduct(name);
}*/

/*
 	@RequestMapping("/products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}*/
