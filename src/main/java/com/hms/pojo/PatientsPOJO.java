package com.hms.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "patients")
public class PatientsPOJO {
	
	private String patName;
	private String patAddress;
	private int patPhone;
	@Id
	private String patId;
	private String patSympotem;
	private String patSymDoctor;
	private String patBed;
	private String patAdimitionDate;
	private String patSurgery;
	private String patSurgeryDate;
	private String patSurgeryComments;
	

}
