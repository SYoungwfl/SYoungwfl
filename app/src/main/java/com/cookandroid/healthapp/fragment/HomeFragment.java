package com.cookandroid.healthapp.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.cookandroid.healthapp.R;
import com.cookandroid.healthapp.activity.AddActivity;
import com.cookandroid.healthapp.activity.CameraActivity;
import com.cookandroid.healthapp.activity.GalleryActivity;
import com.cookandroid.healthapp.activity.LoginActivity;
import com.cookandroid.healthapp.activity.SignupActivity;
import com.cookandroid.healthapp.activity.UserActivity;
import com.cookandroid.healthapp.activity.WritePostActivity;
import com.google.firebase.auth.FirebaseAuth;

public class HomeFragment extends Fragment {

    private Button btn0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false);
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        btn0 = view.findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AddActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }
}