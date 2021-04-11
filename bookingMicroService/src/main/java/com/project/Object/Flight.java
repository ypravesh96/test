package com.project.Object;

import java.sql.Timestamp;
import java.util.Date;





public class Flight {
	
	private String flightName;
	

	private String flightNumber;
	private String source;
	private String destination;
	private Date dateOfDeparture;
	private Timestamp estimatedTime;
	
	
	public Flight() {
		super();
	}
	
	public Flight(String flightName, String flightNumber, String source, String destination, Date dateOfDeparture,
			Timestamp estimatedTime) {
		super();
		this.flightName = flightName;
		this.flightNumber = flightNumber;
		this.source = source;
		this.destination = destination;
		this.dateOfDeparture = dateOfDeparture;
		this.estimatedTime = estimatedTime;
	}

	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public Timestamp getEstimatedTime() {
		return estimatedTime;
	}
	public void setEstimatedTime(Timestamp estimatedTime) {
		this.estimatedTime = estimatedTime;
	}
	
	
	

}
