package com.pavan.natours.controllers;

import java.util.List;

import com.pavan.natours.dto.bookingRequest;

import com.pavan.natours.entities.tours;
import com.pavan.natours.repos.bookingRepository;
import com.pavan.natours.repos.toursRepository;
import com.pavan.natours.service.bookingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class bookingController {

    @Autowired
    toursRepository toursrepository;

    @Autowired
    bookingRepository bookingrepository;
    @Autowired
    bookingService bookingservice;

   
    @RequestMapping("/{id}")
    public String showPopup(@PathVariable("id") int id,Model model) {
    List<tours> findTour = toursrepository.findTourByIds(id);
    model.addAttribute("tour", findTour);
        return "popup";
    }

    @RequestMapping(value = "/conformBooking", method = RequestMethod.POST)
    public String conformBooking(@ModelAttribute("book") bookingRequest request) {
        bookingservice.saveBooking(request);
        
        return "redirect:/";
    }
}
