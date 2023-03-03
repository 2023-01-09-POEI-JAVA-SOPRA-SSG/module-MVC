package com.m2i.AuthorMVC.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyErrorPage implements ErrorController {

	
	@GetMapping("/home")
	public String error() {
		return "index";
	}
}
