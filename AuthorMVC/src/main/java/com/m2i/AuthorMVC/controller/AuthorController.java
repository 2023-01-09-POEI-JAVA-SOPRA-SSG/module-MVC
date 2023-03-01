package com.m2i.AuthorMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.m2i.AuthorMVC.entity.Author;
import com.m2i.AuthorMVC.service.AuthorService;

@Controller
public class AuthorController {

	
	@Autowired
	AuthorService aService;

	@GetMapping("/show")
	public String showView(Model m) {
		m.addAttribute("authors", aService.getAll());
		return "showView";
	}
	
	@GetMapping("/update/{id}")
	public String updateView(@PathVariable("id") int id,Model m) {
		
		m.addAttribute("author", aService.getById(id));
		
		return "updateView";
	}
	
	@GetMapping("/create")
	public String createView(Model m, Author author) {
		return "createView";
	}
	
	@PostMapping("/create")
	public String add(Model m, Author a) {
		aService.createOrSave(a);
		return "redirect:/show";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(Model m, @PathVariable("id") int id) {
		aService.delete( aService.getById(id) );
		return "redirect:/show";
	}
	
	@PostMapping("/update/{id}")
	public String update(@PathVariable("id") int id, Author a) {
		
		a.setId(id);
		aService.createOrSave(a);
		
		return "redirect:/show";
	}
	
	
}
