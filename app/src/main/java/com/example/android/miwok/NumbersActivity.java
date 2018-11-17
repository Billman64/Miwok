package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class NumbersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //    String [] words = new String[10];
        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        int i;
        for(i=0;i<10;i++) {
            Log.v("Miwok app", i + ": " + words[i]);
        }


    }
}
