package com.example.hackforwomen.ui.tools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.hackforwomen.R;
import com.example.hackforwomen.SignUp;
import com.example.hackforwomen.firebase_util.FirebaseImplementation;

public class ToolsFragment extends Fragment {

    private ToolsViewModel toolsViewModel;
    Button event1 , event2;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        //View root = inflater.inflate(R.layout.fragment_tools, container, false);

//        toolsViewModel =
//                ViewModelProviders.of(this).get(ToolsViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_tools, container, false);
        event1 = root.findViewById(R.id.event1);
        event2= root.findViewById(R.id.event2);

        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseImplementation.registerForEvent(SignUp.myinfo , "event1");
                //Toast.makeText(this , "registeration successful" , Toast.LENGTH_SHORT).show();
                Toast.makeText(root.getContext(), "registeration successful", Toast.LENGTH_SHORT).show();
            }
        });

        event2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseImplementation.registerForEvent(SignUp.myinfo , "event2");
                Toast.makeText(root.getContext(), "registeration successful", Toast.LENGTH_SHORT).show();

            }
        });

        return root;
    }
}