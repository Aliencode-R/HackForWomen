package com.example.hackforwomen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class SignUp extends AppCompatActivity {
    TextInputLayout name,moblie,emailid,collegename;
    Button confirmbutton;
    SharedPreferences sharedPreferences;

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


                  //first time is updated here
                  sharedPreferences.edit().putString("firstTime" , "no");
                  finish();
            }
        });


    }
}