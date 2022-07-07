package com.example.healthy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Handler hendler=new Handler(Looper.getMainLooper());
        hendler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Logo= new Intent(MainActivity.this, Login.class);
                startActivity(Logo);
            }
        }, SPLASH_TIME_OUT);
    }
}