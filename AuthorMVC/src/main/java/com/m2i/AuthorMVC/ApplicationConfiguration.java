package com.m2i.AuthorMVC;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ApplicationConfiguration implements
	WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>
{

	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {
//		factory.setPort(8083);
		factory.setContextPath("");
		factory.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST,"/400"));
		factory.addErrorPages(new ErrorPage("/home"));
	}
}
