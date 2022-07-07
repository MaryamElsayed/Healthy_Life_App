package com.example.healthy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;

public class First_Meal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__meal);

        getSupportActionBar().setTitle("Korean BBQ Beef Rice Bowls");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}