package com.example.android.miwok;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;
    public WordAdapter(@NonNull Context context, ArrayList<Word> word, int colorResourceId) {
        super(context, 0, word);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // capture views and populate them
        Word currentWord = getItem(position);
        TextView engTextView = (TextView) listItemView.findViewById(R.id.english);
        engTextView.setText(currentWord.getmDefaultTranslation());
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        // programatically set background color of list item based on given color from the calling class
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId); // convert resourceID to a color int
        textContainer.setBackgroundColor(color);
        engTextView.setBackgroundColor(color);


        // populate imageView (if applicable)
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

        if(currentWord.hasImage()) {
            image.setImageResource(currentWord.getImageResource());
            image.setVisibility(View.VISIBLE);
        } else image.setVisibility(View.GONE);

        return listItemView;

//        return super.getView(position, convertView, parent);
    }
}
