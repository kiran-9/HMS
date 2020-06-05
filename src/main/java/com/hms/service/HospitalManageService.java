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

		String msg = employee.getEmloyee_Name() + " Updated Successfully";
		model.addAttribute(msg);

		logger.info("Exit HospitalManageService :: addDoctor");
		return "doctors";
	}

	public String showDoctors(EmployeesPOJO employees, Model model) {
		logger.info("Executing HospitalManageController :: addDoctor");

		List<EmployeesPOJO> doctorsList = dao.showDoctors(employees);
		model.addAttribute("doctors", doctorsList);

		logger.info("Exit HospitalManageController :: addDoctor");
		return "doctors";
	}

}