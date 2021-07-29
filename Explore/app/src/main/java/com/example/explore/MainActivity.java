package com.example.explore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void link1(View v){
        goToUrl("https://www.youtube.com/channel/UCEBb1b_L6zDS3xTUrIALZOw");
    }
    public void link2(View v){
        goToUrl("https://www.youtube.com/user/FIFATV");
    }
    public void link3(View v){
        goToUrl("https://www.youtube.com/channel/UCBVCi5JbYmfG3q5MEuoWdOw");
    }
    public void link4(View v){
        goToUrl("https://www.youtube.com/channel/UCj5gBoWkv9fRbbAUAlid3eA");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}