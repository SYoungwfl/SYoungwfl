package com.cookandroid.healthapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.bumptech.glide.Glide;
import com.cookandroid.healthapp.R;
import com.cookandroid.healthapp.fragment.HomeFragment;

public class BTN1 extends AppCompatActivity{

    ImageButton btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn1);
        btn1 = findViewById(R.id.g1_gif_img);
        btn2 = findViewById(R.id.g2_gif_img);
        btn3 = findViewById(R.id.g3_gif_img);
        Glide.with(this).load(R.raw.g1).into(btn1);
        Glide.with(this).load(R.raw.g2).into(btn2);
        Glide.with(this).load(R.raw.g3).into(btn3);

    }
}