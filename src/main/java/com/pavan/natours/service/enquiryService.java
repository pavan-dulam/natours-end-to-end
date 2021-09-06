package com.pavan.natours.service;

import com.pavan.natours.dto.enquiryRequest;
import com.pavan.natours.entities.enquiry;

public interface enquiryService {
    
    public enquiry saveEnquiry(enquiryRequest request);
}
