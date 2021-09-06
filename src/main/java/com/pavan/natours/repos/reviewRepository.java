package com.pavan.natours.repos;

import java.util.List;

import com.pavan.natours.entities.reviews;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface reviewRepository extends JpaRepository<reviews,Integer> {
    
    @Query(value = "select * from reviews LIMIT 2", nativeQuery = true)
    List<reviews> showReview();
    
}
