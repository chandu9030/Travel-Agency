package com.travel.Agency.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.travel.Agency.Entity.Driver;
import com.travel.Agency.Entity.Vehicle;
@Service
public interface DriverService {

	Driver addDriver(Driver driver);

	void deleteDriver(Integer driverID);

	List<Driver> viewAlldriver();

	Driver modifyDriver(Driver driver);

}
