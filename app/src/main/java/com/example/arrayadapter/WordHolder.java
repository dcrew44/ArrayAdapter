package com.example.arrayadapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class WordHolder extends RecyclerView.ViewHolder {
    private final TextView eWord;
    private final TextView mWord;
    private final ImageView image;

    public WordHolder(View itemView) {
        super(itemView);
        eWord = itemView.findViewById(R.id.textView1);
        mWord = itemView.findViewById(R.id.textView2);
        image = itemView.findViewById(R.id.imageView2);

    }

    public TextView geteWord() {
        return eWord;
    }

    public TextView getmWord() {
        return mWord;
    }

    public ImageView getImage() {
        return image;
    }

}
