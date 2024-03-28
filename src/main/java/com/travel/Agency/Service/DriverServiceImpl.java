package com.travel.Agency.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.Agency.Entity.Driver;
import com.travel.Agency.Entity.Vehicle;
import com.travel.Agency.Repository.DriverRepository;
import com.travel.Agency.Repository.VehicleRepository;

@Service
public class DriverServiceImpl implements DriverService{


		@Autowired
		public DriverRepository driverrepo;
		@Override
		public Driver addDriver(Driver driver) {
			return driverrepo.save(driver);
		}
		@Override
		public void  deleteDriver(Integer driverID) {
			 driverrepo.deleteById(driverID);
		}
		@Override
		public List<Driver> viewAlldriver() {
			return driverrepo.findAll();
		}
		@Override
		public Driver modifyDriver (Driver driver){
			return driverrepo.save(driver);
		}
}
