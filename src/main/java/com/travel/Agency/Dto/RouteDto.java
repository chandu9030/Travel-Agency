package com.travel.Agency.Dto;

import java.time.Duration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RouteDto {
	private Integer routeID;
	private String source;
	private String destination;
	private double distance;
	private Duration duration;
	public RouteDto() {
		
	}
	
	
}
