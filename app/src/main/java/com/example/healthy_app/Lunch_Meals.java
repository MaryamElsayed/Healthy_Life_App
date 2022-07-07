package com.example.healthy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class Lunch_Meals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch__meals);

        getSupportActionBar().setTitle("Lunch Meals");

        //Meal one
        Button Meal_One=(Button) findViewById(R.id.btn1_L);

        Meal_One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Logo= new Intent(Lunch_Meals.this, First_Meal.class);
                startActivity(Logo);
            }
        });

        //Meal two
        Button Meal_Two=(Button) findViewById(R.id.btn2_L);

        Meal_Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Logo= new Intent(Lunch_Meals.this, Second_Meal.class);
                startActivity(Logo);
            }
        });

        //thrid Meal

        Button Meal_Third=(Button) findViewById(R.id.btn3_L);

        Meal_Third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Logo= new Intent(Lunch_Meals.this, Third_Meal.class);
                startActivity(Logo);
            }
        });

        //Fourth Meal
        Button Meal_Four=(Button) findViewById(R.id.btn4_L);

        Meal_Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Logo= new Intent(Lunch_Meals.this, Fourth_Meal.class);
                startActivity(Logo);
            }
        });

    }
}