package com.pavan.natours.service;

import com.pavan.natours.dto.bookingRequest;
import com.pavan.natours.entities.bookings;

public interface bookingService {
    public bookings saveBooking(bookingRequest request);
}
