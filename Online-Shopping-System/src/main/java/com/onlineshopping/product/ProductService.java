package com.onlineshopping.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
								//	CRUD
@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public Object order(String name) {
		return productRepository.findById(name);
		}
	
	public void changePrice(Product product) {
		productRepository.save(product);
	}	
}


/*
 	public String order(String name) {
		return productRepository.findById(name);
		}
 */

/*
public List<Product> getAllProducts(String productId) {
	
	List<Product> product = new ArrayList<>();
	productRepository.findByProductId(productId)
	.forEach(products::add);
	return products;
}*/

/*	
public String getProduct() {
	productRepository
	return "";
}
*/