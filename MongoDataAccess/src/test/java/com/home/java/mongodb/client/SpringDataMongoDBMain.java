package com.home.java.mongodb.client;

import java.net.UnknownHostException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.home.java.mongodb.dao.UserDao;
import com.home.java.mongodb.entity.User;
import com.mongodb.MongoClient;

public class SpringDataMongoDBMain {
	public static final String DB_NAME = "dharisidb";
	public static final String USER_COLLECTION = "User";
	public static final String MONGO_HOST = "localhost";
	public static final int MONGO_PORT = 27017;

	public static void main(String[] args) {
		// doManual();
		doSpring();
	}

	private static void doSpring() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("mongo-configuration.xml");

		UserDao userDao = ctx.getBean("userDAO", UserDao.class);
		User user = new User();
		user.setFirstName("First Name");
		user.setLastName("lastName");
		user.setGender("Male");
		user.setMiddleName("Middle Name");
		user.setMobile(9620320360L);
		user.setUserName("dsuresh");

		// create
		userDao.createUser(user);
		System.out.println("Generated ID=" + user.getUserId());

		// read
		User p1 = userDao.getUser(user.getUserName());
		System.out.println("Retrieved Person=" + p1);

		// update
		p1.setFirstName("Suresh");
		userDao.updateUser(p1);
		User temp = userDao.getUser(user.getUserName());
		System.out.println("Retrieved Person after update=" + temp);

		// delete
		int count = userDao.deleteUser(user.getUserName());
		System.out.println("Number of records deleted=" + count);

		ctx.close();
	}

	private static void doManual() {
		try {
			MongoClient mongo = new MongoClient(MONGO_HOST, MONGO_PORT);
			MongoOperations mongoOps = new MongoTemplate(mongo, DB_NAME);
			User user = new User();
			user.setFirstName("First Name");
			user.setLastName("lastName");
			user.setGender("Male");
			user.setMiddleName("Middle Name");
			user.setMobile(9620320360L);
			user.setUserName("dsuresh");

			mongoOps.insert(user, USER_COLLECTION);

			User usr = mongoOps.findOne(new Query(Criteria.where("userName").is("dsuresh")), User.class,
					USER_COLLECTION);

			System.out.println(usr);

			mongoOps.dropCollection(USER_COLLECTION);
			mongo.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
