package com.m2i.AuthorMVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.AuthorMVC.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
