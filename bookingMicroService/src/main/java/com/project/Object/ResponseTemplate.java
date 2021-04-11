package com.project.Object;

import com.project.modal.Booking;

public class ResponseTemplate {
	
	private Flight flight;
	private Booking booking;
	public ResponseTemplate() {
		super();
	}
	public ResponseTemplate(Flight flight, Booking booking) {
		super();
		this.flight = flight;
		this.booking = booking;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	

}
