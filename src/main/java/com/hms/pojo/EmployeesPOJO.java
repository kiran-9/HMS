package com.hms.pojo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class EmployeesPOJO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employee_Id;
	private String emloyee_Name;
	private String email;
	private int phone_Number;
	private String hire_Date;
	private String department_Name;
	private int salary;
	private int department_Id;
	private int experience;
	private String employee_role;

	public int getEmployee_Id() {
		return employee_Id;
	}

	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}

	public String getEmloyee_Name() {
		return emloyee_Name;
	}

	public void setEmloyee_Name(String emloyee_Name) {
		this.emloyee_Name = emloyee_Name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone_Number() {
		return phone_Number;
	}

	public void setPhone_Number(int phone_Number) {
		this.phone_Number = phone_Number;
	}

	public String getHire_Date() {
		return hire_Date;
	}

	public void setHire_Date(String hire_Date) {
		this.hire_Date = hire_Date;
	}

	public String getDepartment_Name() {
		return department_Name;
	}

	public void setDepartment_Name(String department_Name) {
		this.department_Name = department_Name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getDepartment_Id() {
		return department_Id;
	}

	public void setDepartment_Id(int department_Id) {
		this.department_Id = department_Id;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getEmployee_role() {
		return employee_role;
	}

	public void setEmployee_role(String employee_role) {
		this.employee_role = employee_role;
	}

	public EmployeesPOJO(String emloyee_Name, String email, int phone_Number, String hire_Date, String department_Name,
			int salary, int department_Id, int experience, String employee_role) {
		super();
		this.emloyee_Name = emloyee_Name;
		this.email = email;
		this.phone_Number = phone_Number;
		this.hire_Date = hire_Date;
		this.department_Name = department_Name;
		this.salary = salary;
		this.department_Id = department_Id;
		this.experience = experience;
		this.employee_role = employee_role;
	}

	public EmployeesPOJO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
