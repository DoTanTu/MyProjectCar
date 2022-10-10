package com.example.projectmyapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HomeActivity extends AppCompatActivity {
    CardView cardView_profile;
    CardView cardView_Food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cardView_profile = (CardView) findViewById(R.id.directional_profile);
        cardView_Food =  (CardView) findViewById(R.id.directional_listFood);

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
}