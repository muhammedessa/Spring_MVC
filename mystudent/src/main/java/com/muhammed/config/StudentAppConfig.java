package com.muhammed.config;

 
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.muhammed.dao.StudentDAO;
import com.muhammed.dao.StudentDAOImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.muhammed.controllers"})
public class StudentAppConfig {
	
 
	 
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
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
