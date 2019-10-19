package com.example.hackforwomen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hackforwomen.data.StudentInfo;
import com.example.hackforwomen.firebase_util.FirebaseImplementation;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity {
    TextInputLayout name,moblie,emailid,collegename;
    Button confirmbutton;
    SharedPreferences sharedPreferences;
    public static StudentInfo myinfo;

    String sname , smobile , semailid, scollegename;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        name = findViewById(R.id.name_til);
        moblie = findViewById(R.id.mobileNumber_til);
        emailid = findViewById(R.id.emailId_til);
        collegename=findViewById(R.id.college_name_til);
        confirmbutton = findViewById(R.id.confirmButton);
        sharedPreferences = getSharedPreferences("com.example.hackforwomen" , MODE_PRIVATE);

        confirmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//                editor.putString("username" , name.getEditText().getText().toString().trim());
//                editor.putString("mobile" , moblie.getEditText().getText().toString().trim());
//                editor.putString("emailid", moblie.getEditText().getText().toString().trim());
//                editor.apply();
                  sname = name.getEditText().getText().toString().trim();
                  smobile= moblie.getEditText().getText().toString().trim();
                  semailid= emailid.getEditText().getText().toString().trim();
                  scollegename=collegename.getEditText().getText().toString().trim();

                  myinfo = new StudentInfo(sname , smobile , semailid , scollegename);
                  sharedPreferences.edit().putString("collegename" , scollegename).apply();

                  FirebaseImplementation.InsertStudent(myinfo);



                  //first time is updated here
                  sharedPreferences.edit().putString("firstTime" , "no").apply();
                  finish();
            }
        });


    }
}