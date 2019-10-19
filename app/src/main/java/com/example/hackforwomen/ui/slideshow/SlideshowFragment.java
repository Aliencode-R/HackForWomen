package com.example.hackforwomen.ui.slideshow;

import android.content.Intent;
<<<<<<< HEAD
import android.net.Uri;
=======
>>>>>>> 29096d670d17cfaa12cb45ee5bcdef3fdc9428f4
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.hackforwomen.EventActivity;
import com.example.hackforwomen.R;

import org.w3c.dom.Text;

public class SlideshowFragment extends Fragment {

    TextView Event1 ;
    TextView Event2;
    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

<<<<<<< HEAD
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);




=======
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        Event1 = root.findViewById(R.id.textView2);
        Event2 = root.findViewById(R.id.textView3);
        Event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(root.getContext(), EventActivity.class);
                startActivity(i);
            }
        });

        Event2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(root.getContext(), EventActivity.class);
                startActivity(i);
            }
        });
>>>>>>> 29096d670d17cfaa12cb45ee5bcdef3fdc9428f4
        return root;
    }
}

