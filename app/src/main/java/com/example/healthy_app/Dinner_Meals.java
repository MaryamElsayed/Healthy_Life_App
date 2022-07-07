package com.example.healthy_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Dinner_Meals extends AppCompatActivity {

//LinearLayout firstmeal,secondmeal,thirdmeal,forthmeal;
//ImageView imageView1,imageView2,imageView3,imageView4;
//TextView textView1,textView2,textView3,textView4;
//Button button1,button2,button3,button4;

    private Thread view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner__meals);
        getSupportActionBar().setTitle("Dinner Meals");

        //First Meal
        Button Meal_One=(Button) findViewById(R.id.btn1_D);
        Meal_One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Logo= new Intent(Dinner_Meals.this, First_D.class);
                startActivity(Logo);
            }
        });

        //Second Meal
        Button Meal_two=(Button) findViewById(R.id.btn2_D);
        Meal_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Logo= new Intent(Dinner_Meals.this, Second_D.class);
                startActivity(Logo);
            }
        });

        //Third Meal
        Button Meal_three=(Button) findViewById(R.id.btn3_D);
        Meal_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Logo= new Intent(Dinner_Meals.this, Third_D.class);
                startActivity(Logo);
            }
        });


        //Forth Meal
        Button Meal_four=(Button) findViewById(R.id.btn4_D);
        Meal_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Logo= new Intent(Dinner_Meals.this, Forth_D.class);
                startActivity(Logo);
            }
        });

    }
}