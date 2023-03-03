package com.m2i.AuthorMVC;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthorMvcApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(AuthorMvcApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("Hello world !");
	}

}
