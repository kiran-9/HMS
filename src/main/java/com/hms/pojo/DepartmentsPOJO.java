package com.hms.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DepartmentsPOJO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int department_Id;

	@Column(nullable = false)
	private String department_Name;
	private int Manager_Id;

	public int getDepartment_Id() {
		return department_Id;
	}

	public void setDepartment_Id(int department_Id) {
		this.department_Id = department_Id;
	}

	public String getDepartment_Name() {
		return department_Name;
	}

	public void setDepartment_Name(String department_Name) {
		this.department_Name = department_Name;
	}

	public int getManager_Id() {
		return Manager_Id;
	}

	public void setManager_Id(int manager_Id) {
		Manager_Id = manager_Id;
	}

	public DepartmentsPOJO(String department_Name, int manager_Id) {
		super();
		this.department_Name = department_Name;
		Manager_Id = manager_Id;
	}

}
