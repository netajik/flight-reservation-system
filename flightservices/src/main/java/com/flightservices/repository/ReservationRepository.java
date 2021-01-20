package com.flightservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightservices.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
