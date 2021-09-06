package com.pavan.natours.entities;

import javax.persistence.Entity;

@Entity
public class enquiry extends abtractEntity {
    private String name;
    private String email;
    private String question;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", question='" + getQuestion() + "'" +
            "}";
    }

    
}
