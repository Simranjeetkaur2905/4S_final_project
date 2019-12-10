package com.example.a4s_764937;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginactivity extends AppCompatActivity {

    EditText email , password ;
    Button loginbutton , registartionbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       // getSupportActionBar().setTitle("Login");

        email = findViewById(R.id.emailtext);
        password = findViewById(R.id.passtext);
        loginbutton = findViewById(R.id.login_button1);
        registartionbutton = findViewById(R.id.register);


        registartionbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginactivity.this,registration.class);
                startActivity(intent);
            }
        });

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(loginactivity.this,homepage.class);
                startActivity(intent);

            }
        });
    }

    public void loginbuttonclick(View view){

        String user , passwordtext;
        user = email.getText().toString();
        passwordtext = password.getText().toString();

        if(user.equals("chakkal@29") && passwordtext.equals("simran")){
            Toast.makeText(this,"welcome to homescreen " + user, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"login failed " + " choose correct email and password", Toast.LENGTH_SHORT).show();

        }

        Intent intent = new Intent(loginactivity.this, homepage.class);
        startActivity(intent);

//        Toast.makeText(this,"Text goes here",Toast.LENGTH_LONG).show();
    }


}
