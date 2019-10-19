package com.example.hackforwomen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hackforwomen.data.StudentInfo;
import com.example.hackforwomen.ui.StudentAdapter;

import java.util.ArrayList;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<StudentInfo> students = StudentInfo.generate(100);

        setContentView(R.layout.activity_event);
        RecyclerView rvStudents = findViewById(R.id.rvStudents);
        rvStudents.setLayoutManager(new LinearLayoutManager(this));
        StudentAdapter studentAdapter = new StudentAdapter(students);
        rvStudents.setAdapter(studentAdapter);
    }
}
