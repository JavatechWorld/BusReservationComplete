package com.ra.busBooking.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ra.busBooking.model.Bookings;




public interface BookingsRepository extends JpaRepository<Bookings, Integer> {

	List<Bookings> findByUserId(int userId);
	
}
