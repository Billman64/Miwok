package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImage;

    public int getAudio() {
        return mAudio;
    }

    public void setAudio(int mAudio) {
        this.mAudio = mAudio;
    }

    private int mAudio;

    private final int NO_IMAGE_RESOURCE = -1;

    public Word(String a, String b, int audio) {
        mDefaultTranslation = a;
        mMiwokTranslation = b;
        mImage = NO_IMAGE_RESOURCE;
        mAudio = audio;
    }

    public Word(String a, String b, int imageResource, int audio) {
        mDefaultTranslation = a;
        mMiwokTranslation = b;
        mImage = imageResource;
        mAudio = audio;
    }

    public int getImageResource() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public boolean hasImage(){
        return mImage != NO_IMAGE_RESOURCE;
    }
}
