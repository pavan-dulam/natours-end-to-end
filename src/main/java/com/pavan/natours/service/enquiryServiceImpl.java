package com.pavan.natours.service;

import com.pavan.natours.dto.enquiryRequest;
import com.pavan.natours.entities.enquiry;
import com.pavan.natours.repos.enquiryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class enquiryServiceImpl implements enquiryService {

    @Autowired
    enquiryRepository enquiryrepository;

    @Override
    public enquiry saveEnquiry(enquiryRequest request) {
        
        enquiry enq= new enquiry();
        enq.setName(request.getName());
        enq.setEmail(request.getEmail());
        enq.setQuestion(request.getQuestion());
        enquiry savedenquiries= enquiryrepository.save(enq);
        return savedenquiries;
        
    }
    
}
