package com.hms.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.ui.Model;

import com.hms.pojo.EmployeesPOJO;
import com.hms.service.HospitalManageService;

public class HospitalManageDao {

	final static Logger logger = Logger.getLogger(HospitalManageService.class);

	public List<EmployeesPOJO> fectch_doctors_list(EmployeesPOJO employees) {
		logger.info("Executing HospitalManageDao :: fectch_doctors_list");

		Configuration configure = new Configuration().configure();
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Query<EmployeesPOJO> query = session.createQuery("from EmployeesPOJO where employee_role =: role");
		query.setParameter("role", "doctor");
		List<EmployeesPOJO> doctorsList = query.list();

		session.close();

		logger.info("Exit HospitalManageDao :: fectch_doctors_list");
		return doctorsList;
	}

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

	public List<EmployeesPOJO> fectch_nurses_list(EmployeesPOJO emplyoyee) {
		logger.info("Executing HospitalManageDao :: fectch_nurses_list");

		Configuration configure = new Configuration().configure();
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Query<EmployeesPOJO> query = session.createQuery("from EmployeesPOJO where employee_role =: role ");
		query.setParameter("role", "nurse");
		List<EmployeesPOJO> list = query.list();

		logger.info("Exit HospitalManageDao :: fectch_nurses_list");
		return list;
	}

	public List<EmployeesPOJO> employees(EmployeesPOJO employees) {
		logger.info("Executing HospitalManageDao :: employees");

		Configuration configure = new Configuration().configure();
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Query<EmployeesPOJO> query = session.createQuery("from EmployeesPOJO");
		List<EmployeesPOJO> list = query.list();

		logger.info("Exit HospitalManageDao :: employees");
		return list;
	}

}