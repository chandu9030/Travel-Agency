package com.travel.Agency.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.Agency.Entity.Booking;
import com.travel.Agency.Repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	public BookingRepository bookingrepo;

	@Override
	public Booking addBooking(Booking booking) {
		return bookingrepo.save(booking);
	}

	@Override
	public void deleteBooking(Integer bookingID) {
		bookingrepo.deleteById(bookingID);
	}

	@Override
	public List<Booking> viewAllbooking() {
		return bookingrepo.findAll();
	}

	@Override
	public Booking modifyBooking(Booking booking) {
		return bookingrepo.save(booking);
	}
}
