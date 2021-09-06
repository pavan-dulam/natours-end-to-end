package com.pavan.natours.repos;

import com.pavan.natours.entities.bookings;

import org.springframework.data.jpa.repository.JpaRepository;


public interface bookingRepository extends JpaRepository<bookings,Integer> {
    
   
}
