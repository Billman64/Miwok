package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    public MediaPlayer mMediaPlayer;

    // put completionListener in a global variable for more resource efficiency
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        //    String [] words = new String[10];
//        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        final ArrayList<Word> words = new ArrayList<Word>();
//        words.add("one");
        words.add(new Word("one","lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("two","otillko", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("three","tolockosu", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("four","oyylse", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("five","massokka", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("six","temmokka", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("seven","kennekaku", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("eight","kawinta", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("nine","wo'e", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("ten","na'aacha", R.drawable.number_ten, R.raw.number_ten));


//        int i = 0;
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
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView)findViewById(R.id.list);
        Log.d("Miwok", "about to set adapter");
        listView.setAdapter(adapter);
//        ListView listView = (ListView) findViewById(R.id.list);

//        listView.setAdapter(itemsAdapter);

//        GridView gv = (GridView) findViewById(R.id.list);

//        gv.setAdapter(itemsAdapter);

        // set an OnItemClickListener to the listView to implement audio feedback specific to each listView item
        final ListView lv = (ListView) listView.findViewById(R.id.list);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, words.get(position).getAudio());
                mMediaPlayer.start();

                // implement audio completion listener
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });

        }

    /**
     * Clean up the media player by releasing its resources.
     * reference from: https://gist.github.com/udacityandroid/f4ec40027031ba7de9352465f143c816
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }
    }
