package com.travel.Agency.Entity;
import java.time.Duration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Route")
public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Integer routeID;
private String source;
private String destination;
private double distance;
private Duration duration;

public Route() {
	super();
	// TODO Auto-generated constructor stub
}
public Route(Integer routeID, String source, String destination, double distance, Duration duration) {
	super();
	this.routeID = routeID;
	this.source = source;
	this.destination = destination;
	this.distance = distance;
	this.duration = duration;
}
public Integer getRouteID() {
	return routeID;
}
public void setRouteID(Integer routeID) {
	this.routeID = routeID;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public double getDistance() {
	return distance;
}
public void setDistance(double distance) {
	this.distance = distance;
}
public Duration getDuration() {
	return duration;
}
public void setDuration(Duration duration) {
	this.duration = duration;
}

}