package com.example.healthy_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Register extends AppCompatActivity {

    EditText et_email, et_password, et_name, et_country;
    Button buttonRegister;
    databaseHelper myDatabaseHelper;
    String email, password, name, conpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getSupportActionBar().setTitle("Register Page");

        et_email = findViewById(R.id.emailText);
        et_password = findViewById(R.id.passwrordtext);
        et_country = findViewById(R.id.countryText);
        et_name = findViewById(R.id.userNameText);
        buttonRegister = findViewById(R.id.registerbtn);

        myDatabaseHelper = new databaseHelper(this);

        buttonRegister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                email = et_email.getText().toString();
                password = et_password.getText().toString();
                name = et_name.getText().toString();
                conpass = et_country.getText().toString();

                if (myDatabaseHelper.isEmpty(et_name))
                {
                    Toast.makeText(getApplicationContext(),"Please Enter Name !",Toast.LENGTH_LONG).show();
                }
                else if (myDatabaseHelper.isEmpty(et_email))
                {
                    Toast.makeText(getApplicationContext(),"Please Enter Email !",Toast.LENGTH_LONG).show();
                }
                else if (myDatabaseHelper.isEmpty(et_password))
                {
                    Toast.makeText(getApplicationContext(),"Please Enter Password !",Toast.LENGTH_LONG).show();
                }
                else if (myDatabaseHelper.isEmpty(et_country))
                {
                    Toast.makeText(getApplicationContext(),"Please confirm your password !",Toast.LENGTH_LONG).show();
                }
                else {
                    if (!password.equals(conpass)) {
                        Toast.makeText(getApplicationContext(), "Your password doesn't match the confirmation !", Toast.LENGTH_LONG).show();

                    }
                    else {
                        myDatabaseHelper.createNewUser(email,conpass);
                        Toast.makeText(getApplicationContext(), "User Added Successfully :) ", Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getApplicationContext(), Meals.class);
                        startActivity(i);
                    }
                }

            }
        });


    }
}

//        Button Register=(Button) findViewById(R.id.registerbtn);
//
//        Register.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent Logo= new Intent(Register.this, Meals.class);
//                startActivity(Logo);
//            }
//        });