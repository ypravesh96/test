package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Object.ResponseTemplate;
import com.project.modal.Booking;
import com.project.service.BookingService;

@RestController
public class BookingController {

	@Autowired
	BookingService service;
	
	@PostMapping("/Bookflight")
	public Booking bookFlight(@RequestBody Booking booking) {
		return service.bookFlight(booking);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplate getBookingWithFlight(@PathVariable("id") String Id) {
		
		return service.getBookingWithFlight(Id);
		
	}
	
	@GetMapping("/showBooking")
	public List<Booking> showBooking() {
		
		return service.showBooking();
		
	}
	
}
