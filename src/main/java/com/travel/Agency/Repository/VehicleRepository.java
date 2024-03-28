package com.travel.Agency.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.Agency.Entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {

	

	

	
}
