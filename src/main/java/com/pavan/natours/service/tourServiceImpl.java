package com.pavan.natours.service;

import java.util.List;

import com.pavan.natours.entities.tours;
import com.pavan.natours.repos.toursRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tourServiceImpl implements tourService {

    @Autowired
    private toursRepository toursrepository;

    @Override
    public List<tours> getAllTours() {
        return toursrepository.popularTour();
    }
    
}
