package com.travel.Agency.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDto {
	private Integer driverNo;
	private String name;
	private String address;
	private String contactNo;
	private String licenseNo;
	public DriverDto() {
		
	}
	public DriverDto(Integer driverNo, String name, String address, String contactNo, String licenseNo) {
		super();
		this.driverNo = driverNo;
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
		this.licenseNo = licenseNo;
	}
	
}
