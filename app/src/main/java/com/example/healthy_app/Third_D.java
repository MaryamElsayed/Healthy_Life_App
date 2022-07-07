package com.example.healthy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Third_D extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third__d);

        getSupportActionBar().setTitle("Chickpea curry");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}