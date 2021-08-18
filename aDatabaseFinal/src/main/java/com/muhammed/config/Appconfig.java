package com.muhammed.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.muhammed.dao.StudentDAO;
import com.muhammed.dao.StudentDAOImpl;


@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.muhammed.controllers"})
public class Appconfig implements WebMvcConfigurer{
	
	@Autowired
	ApplicationContext applicationContext;
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver ivr = new InternalResourceViewResolver();
		ivr.setPrefix("/WEB-INF/views/");
		ivr.setSuffix(".jsp");
		ivr.setOrder(0);
		return ivr;
		
	}
	
	@Bean
	DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/muhammed?useSSL=false");
		dataSource.setUsername("muhammed");
		dataSource.setPassword("muhammed");
		
		return dataSource;
	}
	
	@Bean
	public StudentDAO getUserDao() {
		return new StudentDAOImpl(getDataSource());
	}

}
