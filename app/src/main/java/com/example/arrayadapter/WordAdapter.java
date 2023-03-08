package com.example.arrayadapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Word currentWord = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.word_item, parent, false);
        }

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.textView1);
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.textView2);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView2);

        englishTextView.setText(currentWord.getEWord());
        numberTextView.setText(currentWord.getMWord());
        imageView.setImageResource(currentWord.getImageId());


        return listItemView;
    }
}
