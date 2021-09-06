package com.pavan.natours.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bookings")
public class bookings extends abtractEntity {

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "tid" , referencedColumnName = "id")
    private tours tid;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "uid", referencedColumnName = "id")
    private user_data uid;
    private int price;
    @Column(name = "create_at")
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
    

    public bookings() {

    }


    public bookings(tours tid, user_data uid, int price, Date create_at, Date booking_date) {
        this.tid = tid;
        this.uid = uid;
        this.price = price;
        this.create_at = create_at;
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


    @Override
    public String toString() {
        return "{" +
            " tid='" + getTid() + "'" +
            ", uid='" + getUid() + "'" +
            ", price='" + getPrice() + "'" +
            ", create_at='" + getcreate_at() + "'" +
            "}";
    }

}
