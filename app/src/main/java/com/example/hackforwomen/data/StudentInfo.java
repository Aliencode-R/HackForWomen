package com.example.hackforwomen.data;

import java.util.ArrayList;
import java.util.Random;

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

    public static String[] names = {
            "ankit", "Rishabh", "pavitra", "bhawna", "tata", "ashish"
    };
    public static String[] contacts = {
            "989","179","1550","8700","411","135","88996"
    };
    public static String[] emails = {
            "qwe@gmail.com","rty@yahoo.com","poi@hotmail.com","lki@live.com","gjs@nom.com",
            "yty@noobmail.com","zas@cd.lk"
    };


    public static ArrayList<StudentInfo> generate(int n){
        ArrayList<StudentInfo> students = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            Random r = new Random();
            StudentInfo student = new StudentInfo(names[r.nextInt(6)],
                    contacts[r.nextInt(6)],emails[r.nextInt(6)],"Mait");
            students.add(student);
        }
        return students;
    }
}
