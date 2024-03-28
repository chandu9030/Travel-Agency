package com.travel.Agency.Service;

import java.util.List;

import com.travel.Agency.Entity.Vehicle;

public interface VehicleService {

	Vehicle addVehicle(Vehicle vehicle);

	void deleteVehicle(Integer vehicleID);

	List<Vehicle> viewAllVehicles();

	Vehicle modifyVehicle(Vehicle vehicle);

}
