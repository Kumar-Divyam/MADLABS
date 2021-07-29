package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText username,password;
    int attempt=1;
    Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        username=findViewById(R.id.uuid);
        password=findViewById(R.id.ppwd);
        signin=findViewById(R.id.signin);


    }
    public void signin(View v)
    {
        Bundle b=getIntent().getExtras();
        String uname=b.getString("uid");
        String passwd=b.getString("pwd");
        if(username.getText().toString().equals(uname) && password.getText().toString().equals(passwd))
        {
            Toast.makeText(this,"SIGN IN SUCCESFUL",Toast.LENGTH_LONG).show();
            Intent i=new Intent(this,success.class);
            startActivity(i);
        }
        else
        {
            Toast.makeText(this,"SIGN IN UNSUCCESFUL",Toast.LENGTH_LONG).show();
            attempt++;
            if(attempt==3)
            {


                    signin.setEnabled(false);

            }

        }
    }
}