package com.hms.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hms.pojo.UserPOJO;
import com.hms.service.UserService;

@Controller
public class UserController {

	final static Logger logger = Logger.getLogger(UserController.class);

	/* when we click register in login in form this method will execute */
	@RequestMapping(value = "/register")
	public String register() {
		logger.info("Executing UserController :: register");

		logger.info("Exit UserController :: register");
		return "register";
	}

//	 when we click login in register in form this method will execute 
	@RequestMapping(value = "/login")
	public String login() {

		logger.info("Executing UserController :: login");

		logger.info("Exit UserController :: login");
		return "login";
	}

//	this method execute when we registering new user
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String registerUser(UserPOJO user) {

		logger.info("Executing UserController :: registerUser");

		UserService service = new UserService();
		String result = service.registerUser(user);

		logger.info("Exit UserController :: registerUser");
		return result;
	}

//	executes when existing user login
	@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	public String loginUser(@RequestParam("email") String Uemail, @RequestParam("password") String password,
			Model model) {

		logger.info("Executing UserController :: loginUser");
		UserService service = new UserService();
		String result = service.loginUser(Uemail, password, model);

		logger.info("Exit UserController :: loginUser");
		return result;
	}

//	executes navbar home link

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homeNavLink() {
		logger.info("Executing UserController :: homeNavLink");

		logger.info("Exit UserController :: homeNavLink");
		return "home";
	}

//	executes navbar dashboardlink

	@RequestMapping(value = "/dashboardNavLink", method = RequestMethod.GET)
	public String dashboardNavLink() {
		logger.info("Executing UserController :: dashboardNavLink");

		logger.info("Exit UserController :: dashboardNavLink");
		return "dashboard";
	}

//	executes navbar ourteam link

	@RequestMapping(value = "/ourTeam", method = RequestMethod.GET)
	public String ourTeamNavLink() {
		logger.info("Executing UserController :: ourTeamNavLink");

		logger.info("Exit UserController :: ourTeamNavLink");
		return "administration";
	}

//	executes navbar locations link

	@RequestMapping(value = "/locations", method = RequestMethod.GET)
	public String locationsNavLink() {
		logger.info("Executing UserController :: locationsNavLink");

		logger.info("Exit UserController :: locationsNavLink");
		return "locations";
	}

//	executes navbar payments link

	@RequestMapping(value = "/payments", method = RequestMethod.GET)
	public String paymentsNavLink() {
		logger.info("Executing UserController :: paymentsNavLink");

		logger.info("Exit UserController :: paymentsNavLink");
		return "payments";
	}

//	executes navbar symptomsCheck link

	@RequestMapping(value = "/symptomsCheck", method = RequestMethod.GET)
	public String symptomsCheckNavLink() {
		logger.info("Executing UserController :: locationsNavLink");

		logger.info("Exit UserController :: locationsNavLink");
		return "symptomsCheck";
	}

//	executes navbar health link

	@RequestMapping(value = "/healthTips", method = RequestMethod.GET)
	public String healthTipsNavLink() {
		logger.info("Executing UserController :: healthTipsNavLink");

		logger.info("Exit UserController :: healthTipsNavLink");
		return "healthTips";
	}

//	executes navbar bookAppointement link

	@RequestMapping(value = "/bookAppointment", method = RequestMethod.GET)
	public String bookAppointmentNavLink() {
		logger.info("Executing UserController :: bookAppointmentNavLink");

		logger.info("Exit UserController :: bookAppointmentNavLink");
		return "bookAppointment";
	}

//	executes navbar Online doctor consult  link

	@RequestMapping(value = "/onlineConsultantDoctor", method = RequestMethod.GET)
	public String onlineConsultantDoctorNavLink() {
		logger.info("Executing UserController :: onlineConsultantDoctorNavLink");

		logger.info("Exit UserController :: onlineConsultantDoctorNavLink");
		return "onlineConsultantDoctor";
	}

//	executes navbar contact link

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contactNavLink() {
		logger.info("Executing UserController :: contactNavLink");

		logger.info("Exit UserController :: contactNavLink");
		return "contact";
	}

//	executes navbar feedback link

	@RequestMapping(value = "/feedback", method = RequestMethod.GET)
	public String feedbackNavLink() {
		logger.info("Executing UserController :: feedbackNavLink");

		logger.info("Exit UserController :: feedbackNavLink");
		return "feedback";
	}

//	executes navbar profile link

	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String profileNavLink() {
		logger.info("Executing UserController :: profileNavLink");

		logger.info("Exit UserController :: profileNavLink");
		return "profile";
	}

//	executes navbar logout link

	@RequestMapping(value = "/logOut", method = RequestMethod.GET)
	public String logOutNavLink() {
		logger.info("Executing UserController :: logOutNavLink");

		logger.info("Exit UserController :: logOutNavLink");
		return "home";
	}

}
