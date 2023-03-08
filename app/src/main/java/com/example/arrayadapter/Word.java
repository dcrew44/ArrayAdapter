package com.example.arrayadapter;

public class Word {
    public int imageId;
    private final String eWord;
    private final String mWord;
    private final int audioId;

    public Word(String eWord, String mWord, int audioId, int imageId) {
        this.eWord = eWord;
        this.mWord = mWord;
        this.audioId = audioId;
        this.imageId = imageId;
    }

    // Getters
    public String getEWord() {
        return eWord;
    }

    public String getMWord() {
        return mWord;
    }

    public int getImageId() {
        return imageId;
    }

    public int getAudioId() {
        return audioId;
    }


    public boolean hasImage() {
        return imageId != -1;
    }
}
