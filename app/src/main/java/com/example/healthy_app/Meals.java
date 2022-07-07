package com.example.healthy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class Meals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals);
        //breakfast Meals
        Button breakfast_button=(Button) findViewById(R.id.BreakFast);

        breakfast_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Logo= new Intent(Meals.this, BreakFast_Meal.class);
                startActivity(Logo);

            }
        });

        //lunch Meals
        Button lunch_button=(Button) findViewById(R.id.lunch_button);

        lunch_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Logo= new Intent(Meals.this, Lunch_Meals.class);
                startActivity(Logo);

            }
        });

        //Dinner Meals
        Button Dinner_button=(Button) findViewById(R.id.Dinner);

        Dinner_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Logo= new Intent(Meals.this, Dinner_Meals.class);
                startActivity(Logo);

            }
        });
    }
}