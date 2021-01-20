package com.flightservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightservices.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
