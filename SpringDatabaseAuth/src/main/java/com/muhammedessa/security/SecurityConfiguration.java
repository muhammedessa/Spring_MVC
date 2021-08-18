package com.muhammedessa.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
 
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	
	@Autowired
    DataSource dataSource;
	
	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
			throws Exception {
//		auth.inMemoryAuthentication().withUser("Muhammed").password("1234")
//				.roles("USER", "ADMIN");
		auth.jdbcAuthentication().dataSource(dataSource)
        .usersByUsernameQuery(
            "select username,password, enabled from users where username=?")
        .authoritiesByUsernameQuery(
            "select username, role from user_roles where username=?");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/login").permitAll()
				.antMatchers("/", "/*student*/**").access("hasRole('USER')").and()
				.formLogin().loginPage("/login");
	}
	
}
