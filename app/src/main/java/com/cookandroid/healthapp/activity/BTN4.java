package com.cookandroid.healthapp.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.cookandroid.healthapp.R;

public class BTN4 extends AppCompatActivity {
    ImageButton btn1,btn2,btn3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn4);
        btn1 = findViewById(R.id.p1_gif_img);
        btn2 = findViewById(R.id.p2_gif_img);
        btn3 = findViewById(R.id.p3_gif_img);
        Glide.with(this).load(R.raw.p1).into(btn1);
        Glide.with(this).load(R.raw.p2).into(btn2);
        Glide.with(this).load(R.raw.p3).into(btn3);
    }
}