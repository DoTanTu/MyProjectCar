package com.example.projectmyapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView imgView;
    ImageView dangXuatView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imgView = (ImageView) findViewById(R.id.id_comback_main);
        dangXuatView = (ImageView) findViewById(R.id.id_logout) ;
        dangXuatView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, android.R.style.Theme_DeviceDefault_Dialog);
                builder.setTitle("Bạn có chắc muốn đăng xuất không?");
                builder.setMessage("Vui lòng xác nhận");
                builder.setIcon(R.drawable.warning);
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Logout();
                    }
                });
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }

        });
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageClick();
            }
        });
        initView();

    }
    public void ImageClick(){
        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intent);

    }
    public void Logout(){
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);

    }
    public void initView(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<SoThich> arrayList  = new ArrayList<>();
        arrayList.add(new SoThich(R.drawable.a_chay_bo,"Đi bơi"));
        arrayList.add(new SoThich(R.drawable.a_doc_sach,"Chạy bộ"));
        arrayList.add(new SoThich(R.drawable.a_phuot,"Đi phượt"));
        arrayList.add(new SoThich(R.drawable.a_boi,"đọc sách"));

        soThichAdapter soThichAdapter = new soThichAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(soThichAdapter);
    }
}