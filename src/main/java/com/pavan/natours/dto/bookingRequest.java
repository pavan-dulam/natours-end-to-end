package com.pavan.natours.dto;

import java.util.Date;

import com.pavan.natours.entities.tours;
import com.pavan.natours.entities.user_data;

public class bookingRequest {
    private tours tid;
    private user_data uid;
    private int price;
    private Date create_at;
    private Date booking_date;

    public Date getCreate_at() {
        return this.create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Date getBooking_date() {
        return this.booking_date;
    }

    public void setBooking_date(Date booking_date) {
        this.booking_date = booking_date;
    }
  

    public tours getTid() {
        return this.tid;
    }

    public void setTid(tours tid) {
        this.tid = tid;
    }

    public user_data getUid() {
        return this.uid;
    }

    public void setUid(user_data uid) {
        this.uid = uid;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getcreate_at() {
        return this.create_at;
    }

    public void setcreate_at(Date create_at) {
        this.create_at = create_at;
    }
    
    
}
