package com.muhammedessa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.muhammedessa.models.User;


 


public class UserDaoImpl implements UserDao {

	

	private JdbcTemplate jdbcTemplate; 
	private DataSource dataSource;
	 
	
	@Override
	public void register(User user) {
		 String sql = "insert into users values(?,?,?,?)";

		    jdbcTemplate.update(
		    		sql, new Object[] {
		    				user.getUsername(), 
		    				user.getPassword(), 
		    				user.getFullname(),
		    				1
		     });
		    }


	@Override
	public void setDataSource(DataSource dataSource) {
		 this.dataSource = dataSource;
	      this.jdbcTemplate = new JdbcTemplate(dataSource); 
	}
	  
}



