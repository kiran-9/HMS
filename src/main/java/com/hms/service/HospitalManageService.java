package com.hms.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hms.dao.HospitalManageDao;
import com.hms.pojo.EmployeesPOJO;

public class HospitalManageService {

	final static Logger logger = Logger.getLogger(HospitalManageService.class);
	HospitalManageDao dao = new HospitalManageDao();

	public String addDoctor(EmployeesPOJO employee, Model model) {
		logger.info("Executing HospitalManageService :: addDoctor");

		dao.addDoctor(employee, model);
		List<EmployeesPOJO> doctors_list = dao.fectch_doctors_list(employee);
		

		model.addAttribute("doctors", doctors_list);

		logger.info("Exit HospitalManageService :: addDoctor");
		return "doctors";
	}

	public String fectch_doctors_list(EmployeesPOJO employees, Model model) {
		logger.info("Executing HospitalManageController :: fectch_doctors_list");

		List<EmployeesPOJO> doctorsList = dao.fectch_doctors_list(employees);
		model.addAttribute("doctors", doctorsList);

		logger.info("Exit HospitalManageController :: fectch_doctors_list");
		return "doctors";
	}

}