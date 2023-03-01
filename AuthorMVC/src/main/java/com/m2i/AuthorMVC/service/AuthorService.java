package com.m2i.AuthorMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.AuthorMVC.entity.Author;
import com.m2i.AuthorMVC.repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	AuthorRepository authorRepo;
	
	public List<Author> getAll(){
		return authorRepo.findAll();
	}
	
	public Author getById(int id) {
		return authorRepo.findById(id).orElse(null);
	}
	
	public void delete(Author a) {
		authorRepo.delete(a);
	}
	
	public void createOrSave(Author a) {
		authorRepo.save(a);
	}
	
	
	
	
	
	
}
