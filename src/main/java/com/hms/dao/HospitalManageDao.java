package com.hms.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.helpers.QuietWriter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.ui.Model;

import com.hms.pojo.AppointmentsPOJO;
import com.hms.pojo.EmployeesPOJO;
import com.hms.pojo.PatientsPOJO;
import com.hms.service.HospitalManageService;

public class HospitalManageDao {

	final static Logger logger = Logger.getLogger(HospitalManageService.class);

	public void addDoctor(EmployeesPOJO employee, Model model) {
		logger.info("Executing HospitalManageDao :: addDoctor");

		Configuration configure = new Configuration().configure();
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(employee);

		tx.commit();
		session.close();

		logger.info("Exit HospitalManageDao :: addDoctor");
	}

	/*-------------------------------------------------------------------------------------------------*/

	public List<EmployeesPOJO> fectch_doctors_list(EmployeesPOJO employees) {
		logger.info("Executing HospitalManageDao :: fectch_doctors_list");

		Configuration configure = new Configuration().configure();
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Query<EmployeesPOJO> query = session.createQuery("from EmployeesPOJO where employee_role =: role");
		query.setParameter("role", "doctor");
		List<EmployeesPOJO> doctorsList = query.list();

		tx.commit();
		session.close();

		logger.info("Exit HospitalManageDao :: fectch_doctors_list");
		return doctorsList;
	}

	/*-------------------------------------------------------------------------------------------------*/

	public List<EmployeesPOJO> fectch_nurses_list(EmployeesPOJO emplyoyee) {
		logger.info("Executing HospitalManageDao :: fectch_nurses_list");

		Configuration configure = new Configuration().configure();
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Query<EmployeesPOJO> query = session.createQuery("from EmployeesPOJO where employee_role =: role ");
		query.setParameter("role", "nurse");
		List<EmployeesPOJO> list = query.list();

		tx.commit();
		session.close();

		logger.info("Exit HospitalManageDao :: fectch_nurses_list");
		return list;
	}

	/*-------------------------------------------------------------------------------------------------*/

	public List<EmployeesPOJO> employees(EmployeesPOJO employees) {
		logger.info("Executing HospitalManageDao :: employees");

		Configuration configure = new Configuration().configure();
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Query<EmployeesPOJO> query = session.createQuery("from EmployeesPOJO");
		List<EmployeesPOJO> list = query.list();

		tx.commit();
		session.close();

		logger.info("Exit HospitalManageDao :: employees");
		return list;
	}
	
	/*-------------------------------------------------------------------------------------------------*/

	public void saveAppointments(AppointmentsPOJO appointment) {
		logger.info("Executing HospitalManageDao :: saveAppointments");

		Configuration configure = new Configuration().configure();
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(appointment);

		tx.commit();
		session.close();
    logger.info("Exit HospitalManageDao :: saveAppointments");
	}

	/*-------------------------------------------------------------------------------------------------*/

	public void addPatientForm(PatientsPOJO patient) {
		logger.info("Executing HospitalManagementDao :: addPatientForm");

		Configuration con = new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(patient);
		tx.commit();
		session.close();
		logger.info("Exit HospitalManagementDao :: addPatientForm");
	}
	
	/*-------------------------------------------------------------------------------------------------*/
	
	public List<AppointmentsPOJO> fetch_AppointmentsList(AppointmentsPOJO appointment) {
		
		logger.info("Executing HospitalManageDao :: fetch_AppointmentsList");

		Configuration configure = new Configuration().configure();
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Query<AppointmentsPOJO> query = session.createQuery("from AppointmentsPOJO");
		List<AppointmentsPOJO> list = query.list();
		
		tx.commit();
		session.close();
		
		logger.info("Exit HospitalManageDao :: fetch_AppointmentsList");
		return list;
	}

	/*-------------------------------------------------------------------------------------------------*/

	public List<PatientsPOJO> fetch_patients_list(PatientsPOJO patients) {
		logger.info("Executing HospitalManagementDao :: fetch_patients_list");

		Configuration con = new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Query<PatientsPOJO> query = session.createQuery("from PatientsPOJO");
		List<PatientsPOJO> list = query.list();

		session.close();

		logger.info("Exit HospitalManagementDao :: fetch_patients_list");
		return list;
	}

}