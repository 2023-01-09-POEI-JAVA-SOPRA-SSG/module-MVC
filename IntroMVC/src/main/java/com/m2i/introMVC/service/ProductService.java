package com.m2i.introMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.introMVC.entity.Product;
import com.m2i.introMVC.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository pRepo;
	
	
	public List<Product> getAllProducts(){
		
		return pRepo.findAll();
	}


	public Product getById(int id) {
		return pRepo.findById(id).orElse(null);
	}
	
	public void delete(Product p) {
		pRepo.delete(p);
	}
	
	public void addProduct(Product p) {
		pRepo.save(p);
	}


	public void update(Product p) {
		System.out.println(p);
		pRepo.save(p);
		
	}
	
	
}
