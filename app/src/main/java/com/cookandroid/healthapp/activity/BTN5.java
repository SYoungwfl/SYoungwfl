package com.cookandroid.healthapp.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.cookandroid.healthapp.R;

public class BTN5 extends AppCompatActivity {
    ImageButton btn1,btn2,btn3,btn4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn5);
        btn1 = findViewById(R.id.h1_gif_img);
        btn2 = findViewById(R.id.h2_gif_img);
        btn3 = findViewById(R.id.h3_gif_img);
        btn4 = findViewById(R.id.h4_gif_img);
        Glide.with(this).load(R.raw.h1).into(btn1);
        Glide.with(this).load(R.raw.h2).into(btn2);
        Glide.with(this).load(R.raw.h3).into(btn3);
        Glide.with(this).load(R.raw.h4).into(btn4);
    }
}