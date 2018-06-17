package com.example.android.musicalstructure;

public class Song {
    private String songName;
    private String artistName = "Donal Glover";
    private float songDuration;

    public Song(String name, float duration) {
        songName = name;
        songDuration = duration;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public float getSongDuration() {
        return songDuration;
    }
}
