package com.muhammedessa.dao;

 

import javax.sql.DataSource; 
import com.muhammedessa.models.User;

public interface UserDAO {
 
	void register(User user); 
	public void setDataSource(DataSource dataSource);
}
