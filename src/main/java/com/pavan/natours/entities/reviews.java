package com.pavan.natours.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class reviews extends abtractEntity {
  
    private String slug;
    @Column(name="review_text")
    private String review_text;
    @Column(name = "create_at")
    private Date create_at;
    @OneToOne
    @JoinColumn(name = "tourid", referencedColumnName = "id")
    private tours tourid;
    @OneToOne
    @JoinColumn(name = "userid", referencedColumnName = "id")
    private user_data userid;

   

    public String getSlug() {
        return this.slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }


    public String getreview_text() {
        return this.review_text;
    }

    public void setreview_text(String review_text) {
        this.review_text = review_text;
    }

    public Date getCreate_at() {
        return this.create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }
   

    public Date getcreate_at() {
        return this.create_at;
    }

    public void setcreate_at(Date create_at) {
        this.create_at = create_at;
    }
    

    public tours getTourid() {
        return this.tourid;
    }

    public void setTourid(tours tourid) {
        this.tourid = tourid;
    }

    public user_data getUserid() {
        return this.userid;
    }

    public void setUserid(user_data userid) {
        this.userid = userid;
    }



    @Override
    public String toString() {
        return "{" + " rid='" + getId() + "'" + ", slug='" + getSlug() + "'" + ", review='" + getreview_text() + "'"
                + ", create_at='" + getcreate_at() + "'" + ", tour='" + getTourid() + "'" + ", user='" + getUserid() + "'"
                + "}";
    }

}
