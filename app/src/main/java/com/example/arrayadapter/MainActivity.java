package com.example.arrayadapter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Word[] words = new Word[10];
        words[0] = new Word("lutti", "1", R.raw.number_one, R.drawable.number_one);
        words[1] = new Word("otiiko", "2", R.raw.number_two, R.drawable.number_two);
        words[2] = new Word("tolookosu", "3", R.raw.number_three, R.drawable.number_three);
        words[3] = new Word("oyyisa", "4", R.raw.number_four, R.drawable.number_four);
        words[4] = new Word("massokka", "5", R.raw.number_five, R.drawable.number_five);
        words[5] = new Word("temmokka", "6", R.raw.number_six, R.drawable.number_six);
        words[6] = new Word("kenekaku", "7", R.raw.number_seven, R.drawable.number_seven);
        words[7] = new Word("kawinta", "8", R.raw.number_eight, R.drawable.number_eight);
        words[8] = new Word("wo’e", "9", R.raw.number_nine, R.drawable.number_nine);
        words[9] = new Word("na’aacha", "10", R.raw.number_ten, R.drawable.number_ten);

        WordAdapter adapter = new WordAdapter(words);
        RecyclerView recyclerView = findViewById(R.id.list);
        recyclerView.setAdapter(adapter);


    }
}