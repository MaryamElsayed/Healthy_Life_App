package com.example.healthy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BreakFast_Meal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break_fast__meal);

        getSupportActionBar().setTitle("Breakfast Meals");

        //First Meal
        Button Meal_One=(Button) findViewById(R.id.btn1_BF);
        Meal_One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Logo= new Intent(BreakFast_Meal.this, First_BF.class);
                startActivity(Logo);

            }
        });

        //Meal two
        Button Meal_Two=(Button) findViewById(R.id.btn2_BF);
        Meal_Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Logo= new Intent(BreakFast_Meal.this, Second_BF.class);
                startActivity(Logo);

            }
        });

        //thrid Meal

        Button Meal_Third=(Button) findViewById(R.id.btn3_BF);
        Meal_Third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Logo= new Intent(BreakFast_Meal.this, Third_BF.class);
                startActivity(Logo);

            }
        });

        //Fourth Meal
        Button Meal_Four=(Button) findViewById(R.id.btn4_BF);
        Meal_Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Logo= new Intent(BreakFast_Meal.this, Forth_BF.class);
                startActivity(Logo);
            }
        });

    }
}