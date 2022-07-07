package com.example.healthy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Third_Meal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third__meal);
        getSupportActionBar().setTitle("Zucchini and Beef Skillet");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}