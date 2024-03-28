package com.travel.Agency.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	private String name;
	private String dOB;
	private String gender;
	private String address;
	private String mobileNo;
	private String email;
	private String password;
	public UserDto() {
		
	}
}