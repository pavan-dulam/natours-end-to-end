package com.pavan.natours.controllers;

import java.util.List;

import com.pavan.natours.entities.reviews;
import com.pavan.natours.entities.tours;
import com.pavan.natours.repos.reviewRepository;
import com.pavan.natours.service.tourService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @Autowired
    tourService service;
    @Autowired
    reviewRepository rRepos;
    
    @RequestMapping("/")
    public String home(Model model) {
        List<tours> allTours = service.getAllTours();
        List<reviews> allReviews=rRepos.showReview();
        model.addAttribute("allTours", allTours);
        model.addAttribute("allReviews", allReviews);
        return "index";
    }
}
