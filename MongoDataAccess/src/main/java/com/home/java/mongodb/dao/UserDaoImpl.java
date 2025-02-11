package com.home.java.mongodb.dao;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.home.java.mongodb.entity.User;
import com.mongodb.WriteResult;

public class UserDaoImpl implements UserDao {

	private MongoOperations mongoOps;
	private static final String USER_COLLECTION = "User";

	public UserDaoImpl(MongoOperations mongoOps) {
		this.mongoOps = mongoOps;
	}

	public String createUser(User user) {
		this.mongoOps.insert(user, USER_COLLECTION);
		System.out.println("User =" + user + " is created successfully");
		return user.getUserName();
	}

	public String updateUser(User user) {
		this.mongoOps.save(user, USER_COLLECTION);
		System.out.println("User =" + user + " is updated successfully");
		return user.getUserName();
	}

	public User getUser(String userName) {
		Query query = new Query(Criteria.where("userName").is(userName));
		return this.mongoOps.findOne(query, User.class, USER_COLLECTION);

	}

	public Integer deleteUser(String userName) {
		Query query = new Query(Criteria.where("userName").is(userName));
		WriteResult result = this.mongoOps.remove(query, User.class, USER_COLLECTION);
		return result.getN();
	}

}
