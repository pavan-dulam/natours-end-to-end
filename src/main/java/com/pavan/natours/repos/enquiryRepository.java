package com.pavan.natours.repos;


import com.pavan.natours.entities.enquiry;

import org.springframework.data.jpa.repository.JpaRepository;

public interface enquiryRepository extends JpaRepository<enquiry,Integer> {
    
}
