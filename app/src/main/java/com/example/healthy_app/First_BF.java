package com.example.healthy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class First_BF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__b_f);

        getSupportActionBar().setTitle("Butternut Squash Soup with Pumpkin Seeds and Arugula-Apple Salad");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}