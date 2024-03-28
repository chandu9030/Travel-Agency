package com.travel.Agency.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.Agency.Entity.Vehicle;
import com.travel.Agency.Repository.VehicleRepository;

@Service
public  class VehicleServiceImpl implements VehicleService {

@Autowired
public VehicleRepository vehiclerepo;
@Override
public Vehicle addVehicle(Vehicle vehicle) {
	return vehiclerepo.save(vehicle);
}
@Override
public void  deleteVehicle(Integer vehicleID) {
	 vehiclerepo.deleteById(vehicleID);
}
@Override
public List<Vehicle> viewAllVehicles() {
	return vehiclerepo.findAll();
}
@Override
public Vehicle modifyVehicle (Vehicle vehicle){
	return vehiclerepo.save(vehicle);
}
}

