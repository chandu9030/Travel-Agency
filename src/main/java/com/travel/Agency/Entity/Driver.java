package com.travel.Agency.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Driver")
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Integer driverID;
private Integer driverNo;

private String name;
private String address;
private String contactNo;
private String licenseNo;

public Driver() {
	super();
	// TODO Auto-generated constructor stub
}
public Driver(Integer driverNo, Integer driverID, String name, String address, String contactNo, String licenseNo) {
	super();
	this.driverNo = driverNo;
	this.driverID = driverID;
	this.name = name;
	this.address = address;
	this.contactNo = contactNo;
	this.licenseNo = licenseNo;
}
public Integer getDriverNo() {
	return driverNo;
}
public void setDriverNo(Integer driverNo) {
	this.driverNo = driverNo;
}
public Integer getDriverID() {
	return driverID;
}
public void setDriverID(Integer driverID) {
	this.driverID = driverID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getContactNo() {
	return contactNo;
}
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}
public String getLicenseNo() {
	return licenseNo;
}
public void setLicenseNo(String licenseNo) {
	this.licenseNo = licenseNo;
}

}