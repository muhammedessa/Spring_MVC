package com.muhammedessa.dao;

import javax.sql.DataSource;

import com.muhammedessa.models.User;

public interface UserDao {
	void register(User user);
	public void setDataSource(DataSource ds);
}
