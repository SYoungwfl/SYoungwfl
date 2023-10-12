package com.cookandroid.healthapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageButton;

import com.bumptech.glide.Glide;
import com.cookandroid.healthapp.R;

public class BTN2 extends AppCompatActivity {
    ImageButton btn1,btn2,btn3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn2);
        btn1 = findViewById(R.id.d1_gif_img);
        btn2 = findViewById(R.id.d2_gif_img);
        btn3 = findViewById(R.id.d3_gif_img);
        Glide.with(this).load(R.raw.d1).into(btn1);
        Glide.with(this).load(R.raw.d2).into(btn2);
        Glide.with(this).load(R.raw.d3).into(btn3);

    }
}