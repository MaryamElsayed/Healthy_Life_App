package com.example.healthy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Third_BF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third__b_f);

        getSupportActionBar().setTitle("Strawberry Cobb Salad with Bacon, Eggs, Avocado and Feta");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}