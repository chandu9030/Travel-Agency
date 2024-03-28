package com.travel.Agency.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.Agency.Entity.Booking;
import com.travel.Agency.Service.BookingService;


@RequestMapping("/booking")
@RestController
public class BookingController {

	@Autowired
	public BookingService bookingservice; 

	@GetMapping("/getAllBooking")
 public List<Booking> viewAllbooking() {  
		return bookingservice.viewAllbooking();
	}

	@PutMapping("/updateBooking")
	public Booking modifyBooking(@RequestBody Booking booking) {
		return bookingservice.modifyBooking(booking);
	}

	@DeleteMapping("/deleteBooking")
	public void deleteBooking(@PathVariable Integer bookingID) {
		bookingservice.deleteBooking(bookingID);
	}
}
