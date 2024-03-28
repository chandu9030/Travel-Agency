package com.travel.Agency.Entity;


import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Integer bookingID;
private String bookingDate;
private String journeyDate;
private String boardingPoint;
private String dropPoint;
private Integer noOfPassengers;
private String bookingStatus;

public Booking() {
	super();
	// TODO Auto-generated constructor stub
}
public Booking(Integer bookingID, String bookingDate, String journeyDate, String boardingPoint, String dropPoint,
		Integer noOfPassengers, String bookingStatus) {
	super();
	this.bookingID = bookingID;
	this.bookingDate = bookingDate;
	this.journeyDate = journeyDate;
	this.boardingPoint = boardingPoint;
	this.dropPoint = dropPoint;
	this.noOfPassengers = noOfPassengers;
	this.bookingStatus = bookingStatus;
}
public Integer getBookingID() {
	return bookingID;
}
public void setBookingID(Integer bookingID) {
	this.bookingID = bookingID;
}
public String getBookingDate() {
	return bookingDate;
}
public void setBookingDate(String bookingDate) {
	this.bookingDate = bookingDate;
}
public String getJourneyDate() {
	return journeyDate;
}
public void setJourneyDate(String journeyDate) {
	this.journeyDate = journeyDate;
}
public String getBoardingPoint() {
	return boardingPoint;
}
public void setBoardingPoint(String boardingPoint) {
	this.boardingPoint = boardingPoint;
}
public String getDropPoint() {
	return dropPoint;
}
public void setDropPoint(String dropPoint) {
	this.dropPoint = dropPoint;
}
public Integer getNoOfPassengers() {
	return noOfPassengers;
}
public void setNoOfPassengers(Integer noOfPassengers) {
	this.noOfPassengers = noOfPassengers;
}
public String getBookingStatus() {
	return bookingStatus;
}
public void setBookingStatus(String bookingStatus) {
	this.bookingStatus = bookingStatus;
}
@Override
public String toString() {
	return "Booking [bookingID=" + bookingID + ", bookingDate=" + bookingDate + ", journeyDate=" + journeyDate
			+ ", boardingPoint=" + boardingPoint + ", dropPoint=" + dropPoint + ", noOfPassengers=" + noOfPassengers
			+ ", bookingStatus=" + bookingStatus + "]";
}

	
}
