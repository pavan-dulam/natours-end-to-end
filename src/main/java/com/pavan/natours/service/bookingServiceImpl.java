package com.pavan.natours.service;

import javax.mail.MessagingException;

import com.pavan.natours.dto.bookingRequest;
import com.pavan.natours.entities.bookings;
import com.pavan.natours.repos.bookingRepository;
import com.pavan.natours.util.EmailUtil;
import com.pavan.natours.util.PDFGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookingServiceImpl implements bookingService {

    @Autowired
    bookingRepository bookingrepository;
    @Autowired
    PDFGenerator pDFGenerator;
    @Autowired
    EmailUtil emailUtil;
    @Override
    public bookings saveBooking(bookingRequest request) {
        
        bookings book = new bookings();
        book.setTid(request.getTid());
        book.setUid(request.getUid());
        book.setPrice(request.getPrice());
        book.setcreate_at(request.getcreate_at());

        java.util.Date date = new java.util.Date();
        book.setBooking_date(date);
       bookings save = bookingrepository.save(book);
        String filePath = "C:/Users/pavan/OneDrive/Documents/bills/bill"+save.getId()+".pdf";
       
        pDFGenerator.generateItinerary(save, filePath);
        try {
            emailUtil.sendEmail(save.getUid().getUemail(), filePath);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return save;
    }
    
}
