package com.hms.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hms.pojo.EmployeesPOJO;
import com.hms.service.HospitalManageService;

@Controller
public class HospitalManageController {

	final static Logger logger = Logger.getLogger(HospitalManageController.class);

	@Autowired
	HospitalManageService service;

	@RequestMapping(value = "/doctors")
	public String fectch_doctors_list(EmployeesPOJO employees, Model model) {
		logger.info("Executing HospitalManageController :: fectch_doctors_list");

		String result = service.fectch_doctors_list(employees, model);

		logger.info("Exit HospitalManageController :: fectch_doctors_list");
		return result;
	}

	@RequestMapping(value = "/nurses")
	public String fectch_nurses_list(EmployeesPOJO emplyoyee, Model model) {
		logger.info("Executing HospitalManageController :: fectch_nurses_list");

		String result = service.fectch_nurses_list(emplyoyee, model);

		logger.info("Exit HospitalManageController :: fectch_nurses_list");
		return result;
	}

	@RequestMapping(value = "/patients")
	public String showPatients() {
		logger.info("Executing HospitalManageController :: patients");

		logger.info("Exit HospitalManageController :: patients");
		return null;
	}

	@RequestMapping(value = "/pharmacy")
	public String showPharmacy() {
		logger.info("Executing HospitalManageController :: pharmacy");

		logger.info("Exit HospitalManageController :: pharmacy");
		return null;
	}

	@RequestMapping(value = "/surgeries")
	public String showSurgeries() {
		logger.info("Executing HospitalManageController :: surgeries");

		logger.info("Exit HospitalManageController :: surgeries");
		return null;
	}

	@RequestMapping(value = "/laboratory")
	public String laboratory() {
		logger.info("Executing HospitalManageController :: laboratory");

		logger.info("Exit HospitalManageController :: laboratory");
		return null;
	}

	@RequestMapping(value = "/appointments")
	public String appointments() {
		logger.info("Executing HospitalManageController :: appointments");

		logger.info("Exit HospitalManageController :: appointments");
		return null;
	}

	@RequestMapping(value = "/schedule")
	public String schedule() {
		logger.info("Executing HospitalManageController :: schedule");

		logger.info("Exit HospitalManageController :: schedule");
		return null;
	}

	@RequestMapping(value = "/employees")
	public String employees(EmployeesPOJO employees, Model model) {
		logger.info("Executing HospitalManageController :: employees");
		
		String result = service.employees(employees, model);
		
		logger.info("Exit HospitalManageController :: employees");
		return result;
	}

	@RequestMapping(value = "/reports")
	public String reports() {
		logger.info("Executing HospitalManageController :: reports");

		logger.info("Exit HospitalManageController :: reports");
		return null;
	}

	@RequestMapping(value = "/accounts")
	public String accounts() {
		logger.info("Executing HospitalManageController :: accounts");

		logger.info("Exit HospitalManageController :: accounts");
		return null;
	}

	@RequestMapping(value = "/administration")
	public String administration() {
		logger.info("Executing HospitalManageController :: administration");

		logger.info("Exit HospitalManageController :: administration");
		return "administration";
	}

	@RequestMapping(value = "/addDoctor_form")
	public String addDoctorForm() {
		logger.info("Executing HospitalManageController :: addDoctorForm");

		logger.info("Exit HospitalManageController :: addDoctorForm");
		return "addDoctor_form";
	}

	@RequestMapping(value = "/addNewDoctor", method = RequestMethod.POST)
	public String addDoctor(EmployeesPOJO employee, Model model) {
		logger.info("Executing HospitalManageController :: addDoctor");

		HospitalManageService service = new HospitalManageService();
		String result = service.addDoctor(employee, model);

		logger.info("Exit HospitalManageController :: addDoctor");
		return result;
	}

}
