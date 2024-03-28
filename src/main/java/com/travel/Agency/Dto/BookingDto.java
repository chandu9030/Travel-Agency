package com.travel.Agency.Dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDto {
	private Integer bookingID;
	private LocalDate bookingDate;
	private LocalDate journeyDate;
	private String boardingPoint;
	private String dropPoint;
	private Integer noOfPassengers;
	private String bookingStatus;
	public BookingDto() {
}
	
}
