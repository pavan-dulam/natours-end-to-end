package com.pavan.natours.controllers;

import java.util.Date;
import java.util.List;

import com.pavan.natours.entities.tours;
import com.pavan.natours.repos.toursRepository;
import com.pavan.natours.service.tourService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class tourController {
    @Autowired
    toursRepository toursrepository;
    @Autowired
    tourService service;
    @Autowired
    indexController indexcontroller;


    @RequestMapping("/filteredTours")
    public String findTour( @RequestParam("name") String name,
                            @RequestParam("price")int price,
                            @RequestParam("date") @DateTimeFormat(pattern = "DD/MM/YYYY") Date date,
                            Model model){

        List<tours> tour = toursrepository.findTour(name,price,date);
        model.addAttribute("tour", tour);
        return"filteredTours";
    }

    @RequestMapping("/explore-tours")
    public String exploreTour(Model model)
    {
        List<tours> allTours= service.getAllTours();
        model.addAttribute("allTours", allTours);
        return "exploreTours";
    }

}
