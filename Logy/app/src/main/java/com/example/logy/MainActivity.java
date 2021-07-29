package com.example.logy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.pwd);
        signup = findViewById(R.id.signup);
    }

    public boolean validatepassword(String passwd) {
        Pattern pattern;
        Matcher matcher;
        String passwdpattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%])(?=\\S+$).{8,15}$";
        pattern = Pattern.compile(passwdpattern);
        matcher = pattern.matcher(passwd);
        return matcher.matches();
    }

    public void signup(View v) {
        if (password.getText().toString().length() >= 8 && validatepassword(password.getText().toString())) {
            Toast.makeText(this, "Signup Successfull..!!", Toast.LENGTH_LONG).show();
            Intent i = new Intent(this, activity_login.class);
            Bundle b = new Bundle();
            b.putString("uid", username:getText().toString());
            b.putString("pwd", password:getText().toString());
            i.putExtras(b);
            startActivity(i);
        }
        Toast.makeText(this, "Choose a valid password", Toast.LENGTH_LONG).show();
    }

}