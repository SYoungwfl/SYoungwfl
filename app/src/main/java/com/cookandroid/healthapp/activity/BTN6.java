package com.cookandroid.healthapp.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.cookandroid.healthapp.R;

public class BTN6 extends AppCompatActivity {
    ImageButton btn1,btn2,btn3, btn4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn6);
        btn1 = findViewById(R.id.b1_gif_img);
        btn2 = findViewById(R.id.b2_gif_img);
        btn3 = findViewById(R.id.b3_gif_img);
        btn4 = findViewById(R.id.b4_gif_img);
        Glide.with(this).load(R.raw.b1).into(btn1);
        Glide.with(this).load(R.raw.b2).into(btn2);
        Glide.with(this).load(R.raw.b3).into(btn3);
        Glide.with(this).load(R.raw.b4).into(btn4);
    }
}