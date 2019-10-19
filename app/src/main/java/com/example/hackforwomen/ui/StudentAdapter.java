package com.example.hackforwomen.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hackforwomen.R;
import com.example.hackforwomen.data.StudentInfo;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentHolder> {

    ArrayList<StudentInfo> students;

    public StudentAdapter(ArrayList<StudentInfo> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public StudentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_row, parent, false);
        StudentHolder evh = new StudentHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull StudentHolder holder, int position) {
        StudentInfo student = students.get(position);

        holder.tvName.setText(student.getSname());
        holder.tvcontact.setText(student.getContact());
        holder.tvEmail.setText(student.getEmailid());
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public static class StudentHolder extends RecyclerView.ViewHolder{

        TextView tvName;
        TextView tvcontact;
        TextView tvEmail;
        public StudentHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvcontact = itemView.findViewById(R.id.tvContact);
            tvEmail = itemView.findViewById(R.id.tvEmail);
        }
    }
}
