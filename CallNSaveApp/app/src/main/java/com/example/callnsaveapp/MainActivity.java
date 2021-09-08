package com.example.callnsaveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = findViewById(R.id.number);
    }
    public void delete(View v)
    {
        String mynum=num.getText().toString();
        mynum=mynum.substring(0,mynum.length()-1);
        num.setText(mynum);
    }

    public void one(View v)
    {
        num.append("1");
    }
    public void two(View v)
    {
        num.append("2");
    }
    public void three(View v)
    {
        num.append("3");
    }
    public void four(View v)
    {
        num.append("4");
    }
    public void five(View v)
    {
        num.append("5");
    }
    public void six(View v)
    {
        num.append("6");
    }
    public void seven(View v)
    {
        num.append("7");
    }
    public void eight(View v)
    {
        num.append("8");
    }
    public void nine(View v)
    {
        num.append("9");
    }
    public void star(View v)
    {
        num.append("*");
    }
    public void zero(View v)
    {
        num.append("0");
    }
    public void hash(View v)
    {
        num.append("#");
    }

    public void call(View v)
    {
        String mynum=num.getText().toString();
        Intent i=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+mynum));
        startActivity(i);
    }
    public void save(View v)
    {
        String mynum=num.getText().toString();
        Intent i=new Intent(Intent.ACTION_INSERT, ContactsContract.Contacts.CONTENT_URI);
        i.putExtra(ContactsContract.Intents.Insert.PHONE,mynum);
        startActivity(i);
    }
}