package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //int t=1;
    //Button start,stop;
    TextView counter;
    Handler myhandler= new Handler();
    int i=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //start=findViewById(R.id.start);
        //stop=findViewById(R.id.stop);
        counter=findViewById(R.id.count);
    }
//    public void start(View v){
//        int i=1;
//        while(t==1){
//            counter.setText("" + (i++));
//        }
//    }
//    public void stop(View v){
//        t=0;
//    }
    public void start(View v){
        myhandler.postDelayed(Threadcount,0);
    }
    public void stop(View v){
        myhandler.removeCallbacks(Threadcount);
    }

    public void reset(View v){
        i =1;
    }

    public Runnable Threadcount= new Runnable() {
        @Override
        public void run() {
            counter.setText(""+i);
            i++;
            myhandler.postDelayed(Threadcount,1000);
        }
    };
}