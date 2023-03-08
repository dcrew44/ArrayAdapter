package com.example.arrayadapter;

public class Word {
    private String eWord;
    private String mWord;
    private int audioId;
    public int imageId;

    public Word(String eWord, String mWord,int audioId, int imageId) {
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

    // Setters
    public void setEWord(String eWord) {
        this.eWord = eWord;
    }

    public void setMWord(String mWord) {
        this.mWord = mWord;
    }

    public void setAudioId(int audioId) {
        this.audioId = audioId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
