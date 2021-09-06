package com.pavan.natours.controllers;

import java.util.Optional;


import com.pavan.natours.entities.tours;

import com.pavan.natours.repos.toursRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookingRestController {
   
    @Autowired
    toursRepository tRepository;

    @RequestMapping("booking/{id}")
    public Optional<tours> findTour(@PathVariable("id") int id)
    {

        return tRepository.findById(id);
    }
}
