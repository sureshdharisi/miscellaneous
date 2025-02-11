package com.home.java.mongodb.dao;

import com.home.java.mongodb.entity.User;

public interface UserDao {

	String createUser(User user);

	String updateUser(User user);

	User getUser(String userName);

	Integer deleteUser(String userName);
}
