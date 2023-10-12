package com.cookandroid.healthapp.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.cookandroid.healthapp.R;
import com.cookandroid.healthapp.activity.LoginActivity;
import com.cookandroid.healthapp.activity.UserActivity;
import com.google.firebase.auth.FirebaseAuth;

public class SettingFragment extends Fragment {

    private Button btn1, btn2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting,container,false);
        btn1 = view.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), UserActivity.class);
                startActivity(intent);
            }
        });

        btn2 = view.findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startLoginActivity();
            }
        });
        return view;
    }
    private void startLoginActivity(){
        Intent intent2 = new Intent(getActivity(), LoginActivity.class);
        startActivity(intent2);
        getActivity().finish();
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    }
}