package com.pavan.natours.integration;

import com.pavan.natours.entities.tours;

import org.springframework.web.client.RestTemplate;

public class tourRestClientImpl implements tourRestClient {

    /**
     *
     */
    private static final String BOOKING_REST_URL = "http://localhost:8080/booking/";

    @Override
    public tours findTour(int id) {
        RestTemplate restTemplate= new RestTemplate();
        tours tour = restTemplate.getForObject(BOOKING_REST_URL+id, tours.class);
        return tour;
    }
    
}
