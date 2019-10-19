package com.example.hackforwomen.firebase_util;

import android.content.SharedPreferences;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.hackforwomen.MainActivity;
import com.example.hackforwomen.data.StudentInfo;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public  class FirebaseImplementation {

//    public FirebaseImplementation() {
//    }

    static DatabaseReference dbref;

    public static boolean InsertStudent(StudentInfo studentInfo){

        dbref = FirebaseDatabase.getInstance().getReference();
        dbref.child("registered students").push().setValue(studentInfo);
        return true;
    }

    public  static  boolean registerForEvent(StudentInfo studentInfo , String eventname){

        dbref = FirebaseDatabase.getInstance().getReference();
        dbref.child(eventname).push().setValue(studentInfo);

        return true;

    }

    public static ArrayList<StudentInfo> FatchStudents(final String collegename ,final String eventname){
        final ArrayList<StudentInfo> sameCollegeStudents = new ArrayList<>();
        dbref  = FirebaseDatabase.getInstance().getReference().child(eventname);
        dbref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot ds : dataSnapshot.getChildren())
                {
                    StudentInfo thisStudent=ds.getValue(StudentInfo.class);
                    //Toast.makeText(, "", Toast.LENGTH_SHORT).show();
                    if(thisStudent.getCollegeName().equals(collegename)){
                        sameCollegeStudents.add(thisStudent);
                    }
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        return sameCollegeStudents;

    }



}
