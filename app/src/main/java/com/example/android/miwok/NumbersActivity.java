package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //    String [] words = new String[10];
//        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        int i = 0;
//        for(i=0;i<10;i++) {
//            Log.v("Miwok app", i + ": " + words.get(i));
//        }

//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//        ArrayList<TextView> tv = new ArrayList<TextView>();
//
//        TextView tv1 = new TextView(this);
//        tv1.setText(words.get(0));
//        rootView.addView(tv1);

//        for (i = 0; i < words.size(); i++) {
////        while(i<words.size()){
//            tv.add(new TextView(this));
//            tv.get(i).setText(words.get(i));
//            rootView.addView(tv.get(i));
//            i++;

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

//        ListView listView = (ListView) findViewById(R.id.list);

//        listView.setAdapter(itemsAdapter);

        GridView gv = (GridView) findViewById(R.id.list);

        gv.setAdapter(itemsAdapter);

        }
    }
