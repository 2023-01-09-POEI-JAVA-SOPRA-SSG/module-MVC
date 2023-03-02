package com.m2i.introMVC.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.m2i.introMVC.entity.Product;
import com.m2i.introMVC.service.ProductService;

@Controller
public class HelloController {

	
	@Autowired
	ProductService pService;
		
	
	@GetMapping("/hello")
	public String helloWorld(Model m) {
		
		m.addAttribute("date", new Date());
		m.addAttribute("listProducts", pService.getAllProducts());
		
		m.addAttribute("key", "value");
		
		
		return "index";
	}
	
	
	@GetMapping("/create")
	public String createView(Product p) {
		return "create";
	}
	
	@GetMapping("/update/{id}")
	public String updateView(@PathVariable("id") int id, Model m) {
		
		m.addAttribute("product", pService.getById(id) );
		
		return "update";
	}
	
	
	@PostMapping("/create")
	public String addProduct(Model m, @Valid Product p, 
			BindingResult result) {
		if (result.hasErrors()) {
			return "create";
		}
		
		pService.addProduct(p);
		return "redirect:/hello";
	}
	
	@PostMapping("/update/{id}")
	public String updateProduct(@PathVariable("id") int id, Product p) {
		p.setId(id);
		pService.update(p);
		
		return "redirect:/hello";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		System.out.println(id);
		
		Product p = pService.getById(id);
		pService.delete(p);
		
		return "redirect:/hello";
	}
	

	

	
	
}