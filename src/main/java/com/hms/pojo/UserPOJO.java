
package com.hms.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserPOJO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String password;
	private long mobile;
	private String address;

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public UserPOJO(String email, String password, String name, long mobile, String address) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}

	public UserPOJO(int id, String email, String password, String name, long mobile, String address) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}

	public UserPOJO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
