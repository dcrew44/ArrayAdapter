package com.example.arrayadapter;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("lutti", "1", R.raw.number_one, R.drawable.number_one));
        words.add(new Word("otiiko", "2", R.raw.number_two, R.drawable.number_two));
        words.add(new Word("tolookosu", "3", R.raw.number_three, R.drawable.number_three));
        words.add(new Word("oyyisa", "4", R.raw.number_four, R.drawable.number_four));
        words.add(new Word("massokka", "5", R.raw.number_five, R.drawable.number_five));
        words.add(new Word("temmokka", "6", R.raw.number_six, R.drawable.number_six));
        words.add(new Word("kenekaku", "7", R.raw.number_seven, R.drawable.number_seven));
        words.add(new Word("kawinta", "8", R.raw.number_eight, R.drawable.number_eight));
        words.add(new Word("wo’e", "9", R.raw.number_nine, R.drawable.number_nine));
        words.add(new Word("na’aacha", "10", R.raw.number_ten, R.drawable.number_ten));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Word word = words.get(position);
            MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, word.getAudioId());
            mediaPlayer.start();
        });

    }
}