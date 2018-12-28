package com.example.owner.musicplay;

public class Song {
    //Song title
    private String mSongTitleId;
    //Song composer
    private String mSongComposerId;
    //Song image
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    //
    private final static int NO_IMAGE_PROVIDED = -1;


    public Song(String songTitleId, String songComposerId){
        mSongComposerId = songComposerId;
        mSongTitleId = songTitleId;
        }

    public Song(String songTitleId, String songComposerId, int imageResourceId){
        mSongComposerId = songComposerId;
        mSongTitleId = songTitleId;
        mImageResourceId = imageResourceId;
    }
    //Get Song composer
    public String getSongComposer() {
        return mSongComposerId;
    }
    //Get Song Title

    public String getSongTitle() {
        return mSongTitleId;
    }
    //Return the image resource id for the song
    public int getImageResourceId() {
        return mImageResourceId;
    }
    //Checks for song image
    public boolean hasImage(){ return mImageResourceId != NO_IMAGE_PROVIDED;
}
}
Sincerely,
Emil Mathew

