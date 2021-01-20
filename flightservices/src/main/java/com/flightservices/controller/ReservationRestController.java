package com.flightservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flightservices.entity.Flight;
import com.flightservices.repository.FlightRepository;

@RestController
public class ReservationRestController {
	
	@Autowired
	FlightRepository flightRepository;
	
	@RequestMapping(value="/flights",method=RequestMethod.GET)
	public List<Flight> findFlights() {
		return flightRepository.findAll();
	}
}
