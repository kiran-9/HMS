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

	public List<EmployeesPOJO> showDoctors(EmployeesPOJO employees) {
		logger.info("Executing HospitalManageDao :: getAllDoctorsList");

		Configuration configure = new Configuration().configure();
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Query<EmployeesPOJO> query = session.createQuery("from employees");
		List<EmployeesPOJO> doctorsList = query.list();
		
		session.close();

		logger.info("Exit HospitalManageDao :: getAllDoctorsList");
		return doctorsList;
	}

}