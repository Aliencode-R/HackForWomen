package com.example.hackforwomen.data;

public class StudentInfo {
    String sname;
    String contact;
    String emailid;
    String collegeName;

    public StudentInfo(String sname, String contact, String emailid, String collegeName) {
        this.sname = sname;
        this.contact = contact;
        this.emailid = emailid;
        this.collegeName = collegeName;
    }

    public String getSname() {
        return sname;
    }

    public String getContact() {
        return contact;
    }

    public String getEmailid() {
        return emailid;
    }

    public String getCollegeName() {
        return collegeName;
    }

}
