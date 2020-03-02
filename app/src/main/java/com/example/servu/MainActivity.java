package com.example.servu;

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
    public void goToactivity1(View view) {
        Intent intent = new Intent(this, activity1.class);
        startActivity(intent);
    }

    public void goToactivity2(View view) {
        Intent intent = new Intent(this, activity2.class);
        startActivity(intent);
    }
    public void goToactivity3(View view) {
        Intent intent = new Intent(this, activity3.class);
        startActivity(intent);
    }
    public void goToactivity4(View view) {
        Intent intent = new Intent(this, activity4.class);
        startActivity(intent);
    }
    public void goToactivity5(View view) {
        Intent intent = new Intent(this, activity5.class);
        startActivity(intent);
    }
    public void goToactivity6(View view) {
        Intent intent = new Intent(this, activity6.class);
        startActivity(intent);
    }
    public void goToactivity7(View view) {
        Intent intent = new Intent(this, activity7.class);
        startActivity(intent);
    }
    public void goToactivity8(View view) {
        Intent intent = new Intent(this, activity8.class);
        startActivity(intent);
    }
    public void goToactivity9(View view) {
        Intent intent = new Intent(this, activity9.class);
        startActivity(intent);
    }








}

