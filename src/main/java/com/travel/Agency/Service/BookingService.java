package com.travel.Agency.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.travel.Agency.Entity.Booking;
@Service
public interface BookingService {

	Booking addBooking(Booking booking);

	void deleteBooking(Integer bookingID);

	List<Booking> viewAllbooking();

	Booking modifyBooking(Booking booking);

}
