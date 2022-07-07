package com.example.healthy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class First_D extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__d);

        getSupportActionBar().setTitle("Sweet potato Tex-Mex salad");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}