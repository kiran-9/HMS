package com.hms.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.hms.dao.HospitalManageDao;
import com.hms.pojo.AppointmentsPOJO;
import com.hms.pojo.EmployeesPOJO;
import com.hms.pojo.PatientsPOJO;

public class HospitalManageService {

	final static Logger logger = Logger.getLogger(HospitalManageService.class);

	@Autowired
	HospitalManageDao dao;

	/* this method is for adding new doctor to table */
	public String addDoctor(EmployeesPOJO employee, Model model) {
		logger.info("Executing HospitalManageService :: addDoctor");

		dao.addDoctor(employee, model);
		List<EmployeesPOJO> doctors_list = dao.fectch_doctors_list(employee);

		model.addAttribute("doctors", doctors_list);

		logger.info("Exit HospitalManageService :: addDoctor");
		return "doctors";
	}

	/*-------------------------------------------------------------------------------------------------*/

	/* this method will fetch all the doctors from db */
	public String fectch_doctors_list(EmployeesPOJO employees, Model model) {
		logger.info("Executing HospitalManageService :: fectch_doctors_list");

		List<EmployeesPOJO> doctorsList = dao.fectch_doctors_list(employees);
		model.addAttribute("doctors", doctorsList);

		logger.info("Exit HospitalManageService :: fectch_doctors_list");
		return "doctors";
	}

	/*-------------------------------------------------------------------------------------------------*/

	public String fectch_nurses_list(EmployeesPOJO emplyoyee, Model model) {
		logger.info("Executing HospitalManageService :: fectch_nurses_list");

		List<EmployeesPOJO> nurses_list = dao.fectch_nurses_list(emplyoyee);
		model.addAttribute("nurses", nurses_list);

		logger.info("Exit HospitalManageService :: fectch_nurses_list");
		return "nurses";
	}

	/*-------------------------------------------------------------------------------------------------*/

	public String employees(EmployeesPOJO employees, Model model) {
		logger.info("Executing HospitalManageService :: employees");

		List<EmployeesPOJO> employees_list = dao.employees(employees);
		model.addAttribute("employees", employees_list);

		logger.info("Exit HospitalManageService :: employees");
		return "employees";

	}

	/*-------------------------------------------------------------------------------------------------*/
	public String saveAppointments(AppointmentsPOJO appointment, Model model) {
		logger.info("Executing HospitalManageService :: saveAppointments");

		dao.saveAppointments(appointment);
		model.addAttribute("message", "Appointment has saved sucessfully");
		
		logger.info("Exit HospitalManageService :: saveAppointments");
		return "bookAppointment";
	}

	/*-------------------------------------------------------------------------------------------------*/

	public String fetch_AppointmentsList(AppointmentsPOJO appointment, Model model) {
		logger.info("Executing HospitalManageService :: fetch_AppointmentsList");

		List<AppointmentsPOJO> fetch_AppointmentsList = dao.fetch_AppointmentsList(appointment);
		model.addAttribute("message", "Appointment has saved sucessfully");
		
		logger.info("Exit HospitalManageService :: fetch_AppointmentsList");
		
		return "appointmentsList";
	}

	/*-------------------------------------------------------------------------------------------------*/

	public String addPatientForm(PatientsPOJO patients, Model model) {
		logger.info("Executing HospitalManageService :: addPatientForm");

		dao.addPatientForm(patients);
		List<PatientsPOJO> patients_list = dao.fetch_patients_list(patients);
		model.addAttribute(patients_list);

		logger.info("Exit HospitalManagemeService :: addPatientForm");
		return "patients";
	}

	public String showPatients(PatientsPOJO patients, Model model) {
		logger.info("Executing HospitalManagemeService :: showPatients");

		List<PatientsPOJO> patients_list = dao.fetch_patients_list(patients);
		model.addAttribute("patients", patients_list);

		logger.info("Exit HospitalManagemeService :: showPatients");
		return "patients";
	}

}