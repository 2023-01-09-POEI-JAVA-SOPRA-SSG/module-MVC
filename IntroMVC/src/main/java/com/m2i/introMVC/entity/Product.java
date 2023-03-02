package com.m2i.introMVC.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;

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
	
	@Positive(message = "Price must be positive")
	private int price;
	
	@Length(min = 3, max = 32, message = "Description length must be between 10 & 150 chars")
	private String name;

	@Length(min = 10, max = 150, message = "Description length must be between 10 & 150 chars")
	private String description;
	
	@Positive(message = "quantite must be positive")
	private int quantite;
	
}
