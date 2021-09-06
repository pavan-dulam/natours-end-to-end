package com.pavan.natours.controllers;

import com.pavan.natours.entities.reviews;
import com.pavan.natours.repos.reviewRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class reviewController {
    @Autowired
    private reviewRepository rRepository;

    @RequestMapping(value = "/review", method = RequestMethod.POST)
    public String conformBooking(@ModelAttribute("review") reviews review) {
       rRepository.save(review);

        return "redirect:/";
    }
}
