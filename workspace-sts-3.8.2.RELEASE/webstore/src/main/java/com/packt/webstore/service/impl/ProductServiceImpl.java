package com.packt.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;

public class ProductServiceImpl {
	@Autowired
	private ProductRepository productRepository;
	List<Product> getAllProducts(){
		return productRepository.getAllProducts();
	}
}
