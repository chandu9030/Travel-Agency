package com.travel.Agency.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer vehicleID;
private Integer vehicleNo;
private String  vehicleName;
private Integer seatingCapacity;

private String vehicleType;
private double farePerKm;

public Vehicle() {
	super();
	// TODO Auto-generated constructor stub
}
public Vehicle(Integer vehicleNo, String vehicleName, Integer seatingCapacity, Integer vehicleID, String vehicleType,
		double farePerKm) {
	super();
	this.vehicleNo = vehicleNo;
	this.vehicleName = vehicleName;
	this.seatingCapacity = seatingCapacity;
	this.vehicleID = vehicleID;
	this.vehicleType = vehicleType;
	this.farePerKm = farePerKm;
}
public Integer getVehicleNo() {
	return vehicleNo;
}
public void setVehicleNo(Integer vehicleNo) {
	this.vehicleNo = vehicleNo;
}
public String getVehicleName() {
	return vehicleName;
}
public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
}
public Integer getSeatingCapacity() {
	return seatingCapacity;
}
public void setSeatingCapacity(Integer seatingCapacity) {
	this.seatingCapacity = seatingCapacity;
}
public Integer getVehicleID() {
	return vehicleID;
}
public void setVehicleID(Integer vehicleID) {
	this.vehicleID = vehicleID;
}
public String getVehicleType() {
	return vehicleType;
}
public void setVehicleType(String vehicleType) {
	this.vehicleType = vehicleType;
}
public double getFarePerKm() {
	return farePerKm;
}
public void setFarePerKm(double farePerKm) {
	this.farePerKm = farePerKm;
}

}
	