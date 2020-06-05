package com.hms.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hms.controller.UserController;
import com.hms.pojo.UserPOJO;

public class UserDao {

	final static Logger logger = Logger.getLogger(UserController.class);

	public void register(UserPOJO user) {

		logger.info("Executing UserDao :: registerUser");

		Configuration configure = new Configuration().configure();
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(user);

		tx.commit();
		session.close();

		logger.info("Exit UserController :: registerUser");

	}

	public UserPOJO loginUser(String Uemail, String password) {

		logger.info("Executing UserDao :: loginUser");

		Configuration configure = new Configuration().configure();
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Query Query = session.createQuery("from UserPOJO where email =:mail and password =:password");
		Query.setParameter("mail", Uemail);
		Query.setParameter("password", password);

		UserPOJO user = (UserPOJO) Query.uniqueResult();

		session.close();

		logger.info("Exit UserDao :: loginUser  inside try block ::" + user);
		return user;
	}

}
