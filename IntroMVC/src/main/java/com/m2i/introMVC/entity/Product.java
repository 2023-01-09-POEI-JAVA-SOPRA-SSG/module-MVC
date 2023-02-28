package com.m2i.introMVC.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int price;
	
	private String name;
	
	private String description;
	
	private int quantite;
	
}
