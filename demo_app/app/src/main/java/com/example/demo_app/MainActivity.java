package com.example.demo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1, t2;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t2 = findViewById(R.id.tv2);
    }

    public void display1(View v) {
        t2.setText("hello");
    }

    public void display2(View v) {
        t2.setText("using Android Studio");
    }
}