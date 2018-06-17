package com.example.android.musicalstructure;

public class Song {
    private String songName;
    private String artistName = "Donal Glover";
    private String songDuration;

    public Song(String name, String duration) {
        songName = name;
        songDuration = duration;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getSongDuration() {
        return songDuration;
    }
}
