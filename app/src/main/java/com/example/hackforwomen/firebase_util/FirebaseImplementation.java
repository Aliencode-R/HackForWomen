package com.example.hackforwomen.firebase_util;

import com.example.hackforwomen.data.StudentInfo;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseImplementation {

//    public FirebaseImplementation() {
//    }

    DatabaseReference dbref;

    public boolean InsertStudent(StudentInfo studentInfo){

        dbref = FirebaseDatabase.getInstance().getReference();
        dbref.push().setValue(studentInfo);
        return true;
    }


}
