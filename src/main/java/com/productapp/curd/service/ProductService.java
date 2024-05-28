package com.productapp.curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.curd.entity.Product;
import com.productapp.curd.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products){
		return repository.saveAll(products);
	}
	
	public List<Product> getProducts(){
		return repository.findAll();
	}
	
	public Product getProductById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Product getProductByName(String name) {
		return repository.findByName(name);
	}
	
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "Product removed !! " + id;
	}
	
	public Product updateProduct(Product product) {
		Product existingproduct = repository.findById(product.getId()).orElse(null);
		existingproduct.setName(product.getName());
		existingproduct.setQuantity(product.getQuantity());
		existingproduct.setPrice(product.getPrice());
		return repository.save(product);
	}
	
	
}
