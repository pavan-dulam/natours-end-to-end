package com.pavan.natours.entities;

import java.util.Date;


import javax.persistence.Entity;





@Entity
public class tours extends abtractEntity {
   
    private String name;
    private int duration;
    private int people_limit;
    private int guides;
    private String perks;
    private String difficulty;
    private int price;
    private Date date;
    private String summary;
   
   

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPeople_limit() {
        return this.people_limit;
    }

    public void setPeople_limit(int people_limit) {
        this.people_limit = people_limit;
    }

    public int getGuides() {
        return this.guides;
    }

    public void setGuides(int guides) {
        this.guides = guides;
    }

    public String getPerks() {
        return this.perks;
    }

    public void setPerks(String perks) {
        this.perks = perks;
    }

    public String getDifficulty() {
        return this.difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }



    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", duration='" + getDuration() + "'" +
            ", people_limit='" + getPeople_limit() + "'" +
            ", guides='" + getGuides() + "'" +
            ", perks='" + getPerks() + "'" +
            ", difficulty='" + getDifficulty() + "'" +
            ", price='" + getPrice() + "'" +
            ", date='" + getDate() + "'" +
            ", summary='" + getSummary() + "'" +
            "}";
    }
 

}
