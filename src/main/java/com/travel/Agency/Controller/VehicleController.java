package com.travel.Agency.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.Agency.Entity.Vehicle;
import com.travel.Agency.Service.VehicleService;
@RequestMapping("/vehicle")
@RestController
public class VehicleController {
@Autowired
public VehicleService vehicleservice;
@PostMapping("/addVehicle")
public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
	return vehicleservice.addVehicle(vehicle);

}
@GetMapping("/getAllVehicles")
public List<Vehicle> viewAllVehicles() {
	return vehicleservice.viewAllVehicles();
}
@PutMapping("/updateVehicle")
public Vehicle modifyVehicle (@RequestBody Vehicle vehicle){
	return vehicleservice.modifyVehicle(vehicle);
}
@DeleteMapping("/deleteVehicle")
public void  deleteVehicle(@PathVariable Integer vehicleID) {
	 vehicleservice.deleteVehicle(vehicleID);
}
}