package com.example.yourhealthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login (View v)
    {
        Intent log = new Intent(this, LoginActivity.class);
        startActivity(log);
    }

    public void singin (View v)
    {
        Intent sing = new Intent(this, SinginActivity.class);
        startActivity(sing);
    }
}
