package com.pavan.natours.controllers;


import com.pavan.natours.dto.enquiryRequest;
import com.pavan.natours.service.enquiryService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class enquiryController {

    @Autowired
    enquiryService enquiryservice;

    @RequestMapping(value="/enquiry" , method=RequestMethod.POST)
    public String enquiry(enquiryRequest request)
    {
       enquiryservice.saveEnquiry(request);
        return "redirect:/";
        
    }
    
}
