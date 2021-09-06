package com.pavan.natours.repos;

import java.util.Date;
import java.util.List;

import com.pavan.natours.entities.tours;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

public interface toursRepository extends JpaRepository<tours,Integer> {

    @Query("from tours where name=:name OR price=:price OR date=:date")
    List<tours> findTour(@RequestParam("name") String name,
                         @RequestParam("price") int price,
                         @RequestParam("date") Date date);
    
    @Query("from tours where id=:id")
    List<tours> findTourByIds(@RequestParam("id") int id);

    @Query(value ="select * from tours LIMIT 3", nativeQuery = true)
    List<tours> popularTour();


}
