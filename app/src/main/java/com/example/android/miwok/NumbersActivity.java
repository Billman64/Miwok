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

        ArrayList<Word> words = new ArrayList<Word>();
//        words.add("one");
        words.add(new Word("one","lutti"));
        words.add(new Word("two","otillko"));
        words.add(new Word("three","tolockosu"));
        words.add(new Word("four","oyylse"));
        words.add(new Word("five","massokka"));
        words.add(new Word("six","temmokka"));
        words.add(new Word("seven","kennekaku"));
        words.add(new Word("eight","kawinta"));
        words.add(new Word("nine","wo'e"));
        words.add(new Word("ten","na'aacha"));


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

//        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView)findViewById(R.id.list);
        Log.d("Miwok", "about to set adapter");
        listView.setAdapter(adapter);
//        ListView listView = (ListView) findViewById(R.id.list);

//        listView.setAdapter(itemsAdapter);

//        GridView gv = (GridView) findViewById(R.id.list);

//        gv.setAdapter(itemsAdapter);

        }
    }
