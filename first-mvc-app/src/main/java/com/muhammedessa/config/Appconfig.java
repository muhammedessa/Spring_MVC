package com.muhammedessa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//
//@EnableWebMvc
//@Configuration
//@ComponentScan("com.muhammedessa")
//public class Appconfig implements WebMvcConfigurer{
//	
//	@Autowired
//	ApplicationContext applicationContext;
//	
//	@Bean
//	public ViewResolver viewResolver() {
//		InternalResourceViewResolver ivr = new InternalResourceViewResolver();
//		ivr.setPrefix("/WEB-INF/views/");
//		ivr.setSuffix(".jsp");
//		ivr.setOrder(0);
//		return ivr;
//		
//	}
//
//}
