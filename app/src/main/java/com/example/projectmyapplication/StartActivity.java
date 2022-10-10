package com.example.projectmyapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {


    Handler handler;
    Runnable runnable;
    ImageView img;
    @SuppressLint("Range")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        img = findViewById(R.id.img_start);
        img.animate().alpha(4000.0F).setDuration(0);
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent dsp = new Intent(StartActivity.this,LoginActivity.class);
                startActivity(dsp);
                finish();
            }
        },4000);
    }
}