package com.travel.Agency.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDto {
	private Integer vehicleNo;
	private String  vehicleName;
	private Integer seatingCapacity;
	private Integer driverID;
	private String vehicleType;
	private double farePerKm;
	public VehicleDto() {
		
}
}