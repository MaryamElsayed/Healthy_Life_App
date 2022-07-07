package com.example.healthy_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Login extends AppCompatActivity {
    EditText et_email,et_password;
    Button buttonLogin,tv_register;
    databaseHelper myDatabaseHelper;
    String email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setTitle("Login Page");

            et_email = findViewById(R.id.editTextTextEmailAddress);
            et_password = findViewById(R.id.editTextTextPassword);
            buttonLogin = findViewById(R.id.button);
            tv_register = findViewById(R.id.Register);

            myDatabaseHelper = new databaseHelper(this);

            buttonLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    email = et_email.getText().toString();
                    password = et_password.getText().toString();
                    if (myDatabaseHelper.VerifyUser(email, password)) {
                        Toast.makeText(getApplicationContext(), "Logged in successfully :)", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(Login.this, Meals.class));
                    } else {

                        Toast.makeText(getApplicationContext(), "SomeThing went Wrong !", Toast.LENGTH_LONG).show();
                    }

                }
            });
            tv_register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getApplicationContext(), Register.class);
                    startActivity(i);

                }
            });
        }
    }


//        Button Login=(Button) findViewById(R.id.button);
//
//        Login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent Logo= new Intent(Login.this, Meals.class);
//                startActivity(Logo);
//            }
//        });


//        Button Reg=(Button) findViewById(R.id.Register);
//
//        Reg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent Logo= new Intent(Login.this, Register.class);
//                startActivity(Logo);
//            }
//        });
