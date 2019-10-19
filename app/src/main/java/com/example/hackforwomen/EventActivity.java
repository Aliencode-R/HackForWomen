package com.example.hackforwomen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.hackforwomen.data.StudentInfo;
import com.example.hackforwomen.firebase_util.FirebaseImplementation;
import com.example.hackforwomen.ui.StudentAdapter;

import java.util.ArrayList;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.hackforwomen" , MODE_PRIVATE);
        String eventname = "event1";
        ArrayList<StudentInfo> students = StudentInfo.generate(100);
        //ArrayList<StudentInfo> students = FirebaseImplementation.FatchStudents(sharedPreferences.getString("collegename" , "MAIT") , eventname);
        setContentView(R.layout.activity_event);
        RecyclerView rvStudents = findViewById(R.id.rvStudents);
        rvStudents.setLayoutManager(new LinearLayoutManager(this));
        StudentAdapter studentAdapter = new StudentAdapter(students);
        rvStudents.setAdapter(studentAdapter);
    }
}
