package com.hms.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointmentslist")
public class AppointmentsPOJO {
	
	private String Reason;
	private String Name;
	@Id
	private String email;
	private String phone_Number;
	
	public String getReason() {
		return Reason;
	}
	public void setReason(String reason) {
		Reason = reason;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_Number() {
		return phone_Number;
	}
	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}
	
	public AppointmentsPOJO(String reason, String name, String email, String phone_Number) {
		super();
		Reason = reason;
		Name = name;
		this.email = email;
		this.phone_Number = phone_Number;
	}
	
	@Override
	public String toString() {
		return "AppointmentsPOJO [Reason=" + Reason + ", Name=" + Name + ", email=" + email + ", phone_Number="
				+ phone_Number + "]";
	}
	
	public AppointmentsPOJO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//*******************************

}
