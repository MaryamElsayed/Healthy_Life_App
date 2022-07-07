package com.example.healthy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Second_D extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second__d);

        getSupportActionBar().setTitle("Ginger chicken and amp; green bean noodles");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}