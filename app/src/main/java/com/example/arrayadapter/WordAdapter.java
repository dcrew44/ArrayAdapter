package com.example.arrayadapter;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WordAdapter extends RecyclerView.Adapter<WordHolder> {
    private final Word[] words;

    public WordAdapter(Word[] words) {
        this.words = words;
    }

    @NonNull
    @Override
    public WordHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.word_item, parent, false);
        return new WordHolder(view);
    }

    @Override
    public void onBindViewHolder(WordHolder holder, int position) {
        Word word = words[position];
        holder.geteWord().setText(word.getEWord());
        holder.getmWord().setText(word.getMWord());
        holder.getImage().setImageResource(word.getImageId());
        holder.itemView.setOnClickListener(v -> {
            MediaPlayer mediaPlayer = MediaPlayer.create(v.getContext(), word.getAudioId());
            mediaPlayer.start();
        });
    }

    @Override
    public int getItemCount() {
        return words.length;
    }


}
