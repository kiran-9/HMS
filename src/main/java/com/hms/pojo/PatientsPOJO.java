package com.hms.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patients")
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

	public String getPatName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}

	public String getPatAddress() {
		return patAddress;
	}

	public void setPatAddress(String patAddress) {
		this.patAddress = patAddress;
	}

	public int getPatPhone() {
		return patPhone;
	}

	public void setPatPhone(int patPhone) {
		this.patPhone = patPhone;
	}

	public String getPatId() {
		return patId;
	}

	public void setPatId(String patId) {
		this.patId = patId;
	}

	public String getPatSympotem() {
		return patSympotem;
	}

	public void setPatSympotem(String patSympotem) {
		this.patSympotem = patSympotem;
	}

	public String getPatSymDoctor() {
		return patSymDoctor;
	}

	public void setPatSymDoctor(String patSymDoctor) {
		this.patSymDoctor = patSymDoctor;
	}

	public String getPatBed() {
		return patBed;
	}

	public void setPatBed(String patBed) {
		this.patBed = patBed;
	}

	public String getPatAdimitionDate() {
		return patAdimitionDate;
	}

	public void setPatAdimitionDate(String patAdimitionDate) {
		this.patAdimitionDate = patAdimitionDate;
	}

	public String getPatSurgery() {
		return patSurgery;
	}

	public void setPatSurgery(String patSurgery) {
		this.patSurgery = patSurgery;
	}

	public String getPatSurgeryDate() {
		return patSurgeryDate;
	}

	public void setPatSurgeryDate(String patSurgeryDate) {
		this.patSurgeryDate = patSurgeryDate;
	}

	public String getPatSurgeryComments() {
		return patSurgeryComments;
	}

	public void setPatSurgeryComments(String patSurgeryComments) {
		this.patSurgeryComments = patSurgeryComments;
	}

	public PatientsPOJO(String patName, String patAddress, int patPhone, String patId, String patSympotem,
			String patSymDoctor, String patBed, String patAdimitionDate, String patSurgery, String patSurgeryDate,
			String patSurgeryComments) {
		super();
		this.patName = patName;
		this.patAddress = patAddress;
		this.patPhone = patPhone;
		this.patId = patId;
		this.patSympotem = patSympotem;
		this.patSymDoctor = patSymDoctor;
		this.patBed = patBed;
		this.patAdimitionDate = patAdimitionDate;
		this.patSurgery = patSurgery;
		this.patSurgeryDate = patSurgeryDate;
		this.patSurgeryComments = patSurgeryComments;
	}

	public PatientsPOJO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
