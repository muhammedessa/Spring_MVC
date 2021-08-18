package com.muhammedessa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.muhammedessa.dao.StudentDAO;
import com.muhammedessa.dao.StudentDAOImpl;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages= {"com.muhammedessa.controllers"})


@PropertySources({@PropertySource("classpath:ds/datasource-cfg.properties")})

public class AppConfig implements WebMvcConfigurer{
	
//	@Autowired
//	ApplicationContext applicationContext;
//	@Autowired
//	private Environment env;
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
//	@Bean
//	DriverManagerDataSource getDataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName(env.getProperty("ds.database-driver"));
//		dataSource.setUrl(env.getProperty("ds.url"));
//		dataSource.setUsername(env.getProperty("ds.username"));
//		dataSource.setPassword(env.getProperty("ds.password"));
//		
//		return dataSource;
//	}
//	
//	@Bean
//	public StudentDAO getUserDao() {
//		return new StudentDAOImpl(getDataSource());
//	}
	
 

}
