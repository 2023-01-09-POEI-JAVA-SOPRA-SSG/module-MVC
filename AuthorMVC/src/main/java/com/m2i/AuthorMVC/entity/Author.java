package com.m2i.AuthorMVC.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Author {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Length(max = 64, min = 4, message = "max 64, min 4 chars")
	private String firstName;

	@Length(max = 64, min = 4, message = "max 64, min 4 chars")
	private String lastName;
	
	@Positive(message = "Must be > 0")
	private int age;

	@PastOrPresent(message = "Must be past or present date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateCreationCompte;
	
	@Positive(message = "Must be > 0")
	private int nbFollowers;
}
