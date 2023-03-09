package com.inventory.service;

import com.inventory.model.Product;
import com.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImplementation implements  ProductService{
	@Autowired
	private ProductRepository productRepository;
	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
}
