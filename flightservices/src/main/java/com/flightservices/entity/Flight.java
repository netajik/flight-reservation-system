package com.flightservices.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;

@Entity
public class Flight extends AbstractEntity {
	
	private String flightNumber;
	private String operationAirlines;
	private String departureCity;
	private Date dateOfdeparture;
	private Timestamp estimatedDepartureTime;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperationAirlines() {
		return operationAirlines;
	}

	public void setOperationAirlines(String operationAirlines) {
		this.operationAirlines = operationAirlines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public Date getDateOfdeparture() {
		return dateOfdeparture;
	}

	public void setDateOfdeparture(Date dateOfdeparture) {
		this.dateOfdeparture = dateOfdeparture;
	}

	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
}
