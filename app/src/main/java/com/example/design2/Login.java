package com.example.design2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
     Toolbar toolbar;
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        username = (EditText) findViewById(R.id.userName_id);
        password = (EditText) findViewById(R.id.passwrd_id);
        toolbar =(Toolbar) findViewById(R.id.toolbar_id); /*  creating a connection ffrom toolbar */

        setSupportActionBar(toolbar);
    }

    public void login(View view) {

        if (username.getText().toString().equals("username") && password.getText().toString().equals("password")){

            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else if(!(username.getText().toString().equals("username") && password.getText().toString().equals("password"))){

            Toast.makeText(getApplicationContext(), "Please Enter Valid Password", Toast.LENGTH_LONG).show();
        }

    }
}
