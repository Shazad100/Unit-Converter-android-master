package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Button btnTempp , btnLenn, btnMasss, btnSped , btnVoll, btnAreaa , btnFuell , brnTimee, btnDigi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnTempp=findViewById(R.id.btnTemp);
        btnLenn=findViewById(R.id.btnLen);
        btnMasss=findViewById(R.id.btnMass);
        btnSped=findViewById(R.id.btnSpeed);
        btnVoll=findViewById(R.id.btnVol);
        btnAreaa=findViewById(R.id.btnArea);

        btnTempp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Temperature.class);
                startActivity(intent);
            }
        });

        btnLenn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Length.class);
                startActivity(intent);
            }
        });

        btnMasss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Mass.class);
                startActivity(intent);
            }
        });

        btnSped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Speed.class);
                startActivity(intent);
            }
        });

        btnVoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Volume.class);
                startActivity(intent);
            }
        });

        btnAreaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Area.class);
                startActivity(intent);
            }
        });

    }
}