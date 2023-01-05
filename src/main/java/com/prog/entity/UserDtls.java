package com.prog.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USER_DTLS")
public class UserDtls 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Name")
	private String fullname;
	
	@Column
	private String gender;
	@Column
	private String dob;
	@Column
	private String address;
	@Column
	private String email;
	@Column
	private String password;
	@Override
	public String toString() {
		return "UserDtls [id=" + id + ", fullname=" + fullname + ", gender=" + gender + ", dob=" + dob + ", address="
				+ address + ", email=" + email + ", password=" + password + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	

	public UserDtls() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDtls(int id, String fullname, String gender, String dob, String address, String email, String password) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.email = email;
		this.password = password;
	}

}
