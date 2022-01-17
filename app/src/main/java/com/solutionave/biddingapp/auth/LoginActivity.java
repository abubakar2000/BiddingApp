package com.solutionave.biddingapp.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.solutionave.biddingapp.R;
import com.solutionave.biddingapp.main.HomeActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //intent for signup activity
        findViewById(R.id.signupButtonLoginAct).setOnClickListener(__ -> {
            Toast.makeText(LoginActivity.this, "Lets Sign up", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(LoginActivity.this,SIgnupActivity.class));
        });

        //intent for the login activity
        findViewById(R.id.loginButtonLoginAct).setOnClickListener(__ -> {
            Toast.makeText(LoginActivity.this, "Logged In", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(LoginActivity.this, HomeActivity.class));
        });
    }
}