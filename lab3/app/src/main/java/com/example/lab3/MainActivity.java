package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.uid);
        password=findViewById(R.id.pwd);
    }
    public boolean validatePassword(String s)
    {
        Pattern ptrn;
        Matcher match;

        String passptrn="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        ptrn=Pattern.compile(passptrn);
        match=ptrn.matcher(s);
        return match.matches();




    }

    public void signup(View v)
    {
        if(password.getText().toString().length()>=8 && validatePassword(password.getText().toString()))
        {
            Toast.makeText(this,"SIGNUP DONE",Toast.LENGTH_LONG).show();
            Intent i=new Intent(this,MainActivity2.class);
            Bundle b=new Bundle();
            b.putString("uid",username.getText().toString());
            b.putString("pwd",password.getText().toString());
            i.putExtras(b);
            startActivity(i);

        }
        else
        {
            Toast.makeText(this,"password is not meeting constraints",Toast.LENGTH_LONG).show();
        }
//        Toast.makeText(this,password.getText().toString(),Toast.LENGTH_LONG).show();


    }

}