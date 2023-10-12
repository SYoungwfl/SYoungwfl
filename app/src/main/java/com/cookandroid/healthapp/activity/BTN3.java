package com.cookandroid.healthapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageButton;

import com.bumptech.glide.Glide;
import com.cookandroid.healthapp.R;

public class BTN3 extends AppCompatActivity {
    ImageButton btn1,btn2,btn3,btn4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn3);
        btn1 = findViewById(R.id.s1_gif_img);
        btn2 = findViewById(R.id.s2_gif_img);
        btn3 = findViewById(R.id.s3_gif_img);
        btn4 = findViewById(R.id.s4_gif_img);
        Glide.with(this).load(R.raw.s1).into(btn1);
        Glide.with(this).load(R.raw.s2).into(btn2);
        Glide.with(this).load(R.raw.s3).into(btn3);
        Glide.with(this).load(R.raw.s4).into(btn4);
    }
}