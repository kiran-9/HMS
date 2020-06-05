package com.hms.service;

import org.apache.log4j.Logger;
import org.springframework.ui.Model;

import com.hms.controller.UserController;
import com.hms.dao.UserDao;
import com.hms.pojo.UserPOJO;

public class UserService {

	final static Logger logger = Logger.getLogger(UserController.class);

	public String registerUser(UserPOJO user) {
		
		logger.info("Executing UserService :: registerUser");

		UserDao dao = new UserDao();
		dao.register(user);

		logger.info("Exit UserService :: registerUser");
		
		return "register";
	}

	public String loginUser(String Uemail, String password, Model model) {
		
		logger.info("Executing UserService :: loginUser");
		
		
		UserDao dao = new UserDao();
		UserPOJO user = dao.loginUser(Uemail, password);
		logger.info("-----------user");
		
		try {
			
			if(user != null) {
				
				logger.info("user object not null");
				
				String message = "Hello"+ user.getName()+"! Welocme Back";
				model.addAttribute(message);
				return "dashboard";
			}else {
				String message = "Invalid Username Or Password";
				model.addAttribute(message);
			}
			
			logger.info("Exit UserService :: loginUser");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "login";
	}
}
