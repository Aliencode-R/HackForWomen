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
            "ankit", "Rishabh", "pavitra", "bhawna", "mohit", "ashish" , "rohit" , "kshem" , "Daman" , "suresh" , "virat"
    };
    public static String[] contacts = {
            "9675142578","9587463258","9784625813","8736517589","9314587625","9345872165","8897483251","9975486215" , "9977845762" , "9758462578" , "9599821727"
    };
    public static String[] emails = {
            "roronoazoro@gmail.com","lifegood@yahoo.com","theHero@hotmail.com","thor9877@live.com","gjs@nom.com",
            "yty@noobmail.com","zas@cd.lk" , "kritomoron4423@gmail.com" , "wildbeast@yahoo.com" , "hellraizer@gmail.com" , "sharma7762@gmail.com"
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
