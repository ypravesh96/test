package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.project.Object.Flight;
import com.project.Object.ResponseTemplate;
import com.project.modal.Booking;
import com.project.repository.BookingRepository;

public class BookingService {
	
	
	@Autowired
	BookingRepository repo;
	
	@Autowired
	private RestTemplate restTemplate;

	public Booking bookFlight(Booking booking) {

       return repo.save(booking);
		
	}

	public List<Booking> showBooking() {
		
		return repo.findAll();
	}

	

	public ResponseTemplate getBookingWithFlight(String id) {
		
		ResponseTemplate response= new ResponseTemplate();
		Optional<Booking> optionalBooking= repo.findById(id);
		Booking booking=optionalBooking.get();
		
		Flight flight= restTemplate.getForObject("http://localhost:8888/findFlights/", Flight.class);
		
		response.setBooking(booking);
		response.setFlight(flight);
		return response;
	}

}
