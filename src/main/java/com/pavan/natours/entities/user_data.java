package com.pavan.natours.entities;


import javax.persistence.Entity;


@Entity
public class user_data extends abtractEntity {
    
    private String uname;
    private String uemail;
    private String uphoto;
    private String urole;
    private String upass;


    public String getUname() {
        return this.uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUemail() {
        return this.uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUphoto() {
        return this.uphoto;
    }

    public void setUphoto(String uphoto) {
        this.uphoto = uphoto;
    }

    public String getUrole() {
        return this.urole;
    }

    public void setUrole(String urole) {
        this.urole = urole;
    }

    public String getUpass() {
        return this.upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }


    @Override
    public String toString() {
        return "{" +
            " uname='" + getUname() + "'" +
            ", uemail='" + getUemail() + "'" +
            ", uphoto='" + getUphoto() + "'" +
            ", urole='" + getUrole() + "'" +
            ", upass='" + getUpass() + "'" +
            "}";
    }
    

}
