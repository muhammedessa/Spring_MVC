package com.muhammedessa.dao;
 
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.muhammedessa.models.User; 
public class UserDAOImpl implements UserDAO {

	
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
 
	 
	@Override
	public void register(User user) { 
		String sql = "INSERT INTO users VALUES (?,?,?,?)";
		jdbcTemplate.update(sql,new Object[] {
				user.getUsername(),
				user.getPassword(),
				user.getFullname(),
				1
		});
		
		System.out.println("user created successfully !");
	}
 
	 

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}



}
