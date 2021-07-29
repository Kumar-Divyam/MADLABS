package com.example.logy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_login extends AppCompatActivity {
    EditText username,password;
    Button login;
    int attempts=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View v) {
        Bundle b = getIntent().getBundleExtra();
        String uname = b.getString("uid");
        String passwd = b.getString("pwd");
        if (uname.equals(username.getText().toString()) && passwd.equals(password.getText().toString())) {
            Toast.makeText(this, "Login Successfully..!", Toast.LENGTH_LONG).show();
            Intent i = new Intent(this, activity_success.class);
            startActivity(i);
        } else {
            attempts++;
            if (attempts <= 2) {
                Toast.makeText(this, "Login Failed..!", Toast.LENGTH_LONG).show();
                username.setText(null);
                password.setText(null);
            } else {
                Toast.makeText(this, "Exceeded max attempts..!", Toast.LENGTH_LONG).show();
                username.setText(null);
                password.setText(null);
                login.setEnabled(false);
            }
        }
    }
}