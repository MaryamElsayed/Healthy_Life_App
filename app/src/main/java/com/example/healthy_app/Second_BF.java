package com.example.healthy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Second_BF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second__b_f);

        getSupportActionBar().setTitle("Apple-Cheddar Grilled Cheese Sandwiches with Arugula, Apple");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}