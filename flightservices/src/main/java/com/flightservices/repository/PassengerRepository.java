package com.flightservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightservices.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
