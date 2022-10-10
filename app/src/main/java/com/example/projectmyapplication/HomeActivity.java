package com.example.projectmyapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HomeActivity extends AppCompatActivity {
    CardView cardView_profile;
    CardView cardView_Food;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cardView_profile = (CardView) findViewById(R.id.directional_profile);
        cardView_Food =  (CardView) findViewById(R.id.directional_listFood);
        imageView = (ImageView) findViewById(R.id.id_comback_login) ;

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DirectionalLogin();
            }
        });

        cardView_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DirectionalProfile();

            }
        });
        cardView_Food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DirectionalListFood();

            }
        });
    }
    public void DirectionalProfile(){
        Intent intent = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(intent);

    }

    public void DirectionalListFood(){
        Intent intent = new Intent(HomeActivity.this,CarHomeActivity.class);
        startActivity(intent);

    }

    public void DirectionalLogin(){
        Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
        startActivity(intent);

    }
}