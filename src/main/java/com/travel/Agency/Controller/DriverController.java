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

import com.travel.Agency.Entity.Driver;
import com.travel.Agency.Repository.RouteRepository;
import com.travel.Agency.Service.DriverService;

@RequestMapping("/driver")
@RestController
public class DriverController {
	@Autowired
	public DriverService driverservice;
	@PostMapping()
	public Driver addDriver(@RequestBody Driver driver) {
		return driverservice. addDriver(driver);
}
	@GetMapping("/getAllDriver")
	public List<Driver> viewAlldriver() {
		return driverservice.viewAlldriver();
}
	@PutMapping("/updateDriver")
	public Driver modifyDriver (@RequestBody Driver driver){
		return driverservice.modifyDriver(driver);
	}
	@DeleteMapping("/deleteDriver")
	public void  deleteDriver(@PathVariable Integer driverID) {
		 driverservice.deleteDriver(driverID); 
	}
}
