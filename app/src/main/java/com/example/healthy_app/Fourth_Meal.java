package com.example.healthy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Fourth_Meal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth__meal);

        getSupportActionBar().setTitle("Asian Pork Noodles with Lime, Basil and Spinach");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}