package com.travel.Agency.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Integer userId;
private String username;
private String dOB;
private String gender;
private String address;
private String mobileNo;
private String email;
private String password;
public User() {
	
}
public User(Integer userId, String username, String dOB, String gender, String address, String mobileNo, String email,
		String password) {
	super();
	this.userId = userId;
	this.username = username;
	this.dOB = dOB;
	this.gender = gender;
	this.address = address;
	this.mobileNo = mobileNo;
	this.email = email;
	this.password = password;
}
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getdOB() {
	return dOB;
}
public void setdOB(String dOB) {
	this.dOB = dOB;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
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

}