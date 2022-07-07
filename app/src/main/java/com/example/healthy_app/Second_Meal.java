package com.example.healthy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Second_Meal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second__meal);

        getSupportActionBar().setTitle("Vegetable and Cashew Stir Fry With Basmati Rice");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}