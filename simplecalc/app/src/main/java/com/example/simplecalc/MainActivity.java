package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView res;
    String str;
    char operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        res=findViewById(R.id.res);
    }
    public void zero(View v){
        if(num1.hasFocus()){
            num1.append("0");
        }
        else if(num2.hasFocus()) {
            num2.append("0");
        }
        Toast.makeText(MainActivity.this,"place cursor on num 1 or num 2",Toast.LENGTH_LONG).show();
    }


    public void one(View v){
        if(num1.hasFocus()){
            num1.append("1");
        }
        else if(num2.hasFocus()) {
            num2.append("1");
        }
        Toast.makeText(MainActivity.this,"place cursor on num 1 or num 2",Toast.LENGTH_LONG).show();
    }

    public void two(View v){
        if(num1.hasFocus()){
            num1.append("2");
        }
        else if(num2.hasFocus()) {
            num2.append("2");
        }
        Toast.makeText(MainActivity.this,"place cursor on num 1 or num 2",Toast.LENGTH_LONG).show();
    }
    public void three(View v){
        if(num1.hasFocus()){
            num1.append("3");
        }
        else if(num2.hasFocus()) {
            num2.append("3");
        }
        Toast.makeText(MainActivity.this,"place cursor on num 1 or num 2",Toast.LENGTH_LONG).show();
    }
    public void four(View v){
        if(num1.hasFocus()){
            num1.append("4");
        }
        else if(num2.hasFocus()) {
            num2.append("4");
        }
        Toast.makeText(MainActivity.this,"place cursor on num 1 or num 2",Toast.LENGTH_LONG).show();
    }
    public void five(View v){
        if(num1.hasFocus()){
            num1.append("5");
        }
        else if(num2.hasFocus()) {
            num2.append("1");
        }
        Toast.makeText(MainActivity.this,"place cursor on num 1 or num 2",Toast.LENGTH_LONG).show();
    }
    public void six(View v){
        if(num1.hasFocus()){
            num1.append("6");
        }
        else if(num2.hasFocus()) {
            num2.append("6");
        }
        Toast.makeText(MainActivity.this,"place cursor on num 1 or num 2",Toast.LENGTH_LONG).show();
    }
    public void seven(View v){
        if(num1.hasFocus()){
            num1.append("7");
        }
        else if(num2.hasFocus()) {
            num2.append("7");
        }
        Toast.makeText(MainActivity.this,"place cursor on num 1 or num 2",Toast.LENGTH_LONG).show();
    }
    public void eight(View v){
        if(num1.hasFocus()){
            num1.append("8");
        }
        else if(num2.hasFocus()) {
            num2.append("8");
        }
        Toast.makeText(MainActivity.this,"place cursor on num 1 or num 2",Toast.LENGTH_LONG).show();
    }
    public void nine(View v){
        if(num1.hasFocus()){
            num1.append("9");
        }
        else if(num2.hasFocus()) {
            num2.append("9");
        }
        Toast.makeText(MainActivity.this,"place cursor on num 1 or num 2",Toast.LENGTH_LONG).show();
    }
    public void decimal(View v){
        if(num1.hasFocus()){
            num1.append(".");
        }
        else if(num2.hasFocus()) {
            num2.append(".");
        }
        Toast.makeText(MainActivity.this,"place cursor on num 1 or num 2",Toast.LENGTH_LONG).show();
    }

    public void add(View v){ operator = '+';}
    public void subtract(View v){ operator = '-';}
    public void multiply(View v){ operator = '*';}
    public void divide(View v){ operator = '/';}
    public void equal(View v){
        float n1;
        float n2;
        float r;
        n1 = Float.parseFloat(num1.getText().toString());
        n2 = Float.parseFloat(num2.getText().toString());
        switch (operator){
            case '+':   r = n1 + n2;
                        res.setText("" + r);
                        break;
            case '-':   r = n1 - n2;
                        res.setText("" + r);
                        break;
            case '*':   r = n1 * n2;
                        res.setText("" + r);
                        break;

            case '/':   if (n2 == 0) {
                res.setText("");
                Toast.makeText(this, "divide by zero is not allowed", Toast.LENGTH_LONG).show();
            }
                        else {
                            r = n1 / n2;
                            res.setText("" + r);
            }
                break;
        }
        }
        public void clearfield(View v){
            if (num1.hasFocus())
                num1.setText("");
            else if (num2.hasFocus())
                num2.setText("");
            else  if(res.hasFocus())
                res.setText("");
        }

        public void clearall(View v){
            num1.setText("");
            num2.setText("");
            res.setText("");
        }

        public void clearlast(View v){
            if (num1.hasFocus()){
                String s = num1.getText().toString();
                s = s.substring(0, s.length()-1);
                num1.setText(s);
            }
            else if (num1.hasFocus()){
                String s = num2.getText().toString();
                s = s.substring(0, s.length()-1);
                num2.setText(s);
            }
        }
    }


