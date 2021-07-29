package com.example.labtest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.uid);
        password = findViewById(R.id.pwd);
    }
    public void signup(View v){
        if (password.getText().toString().length() >= 8 && validatepassword(password.getText().toString())){
            Toast.makeText(this,"Sign Up Successfull !",Toast.LENGTH_LONG).show();
            Intent i =new Intent(this, SignIn.class);
            Bundle b = new Bundle();
            b.putString("uid", username.getText().toString());
            b.putString("pwd", password.getText().toString());
            i.putExtras(b);
            startActivity(i);
        }
    }

    public boolean validatepassword(String password){
        Pattern ptrn;
        Matcher mat;
        String passptrn= "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[<>/@%$#+=_!])(?=\\S+$).{8,}$";
        ptrn = Pattern.compile(passptrn);
        mat = ptrn.matcher(password);
        return mat.matches();
    }
}