package com.example.android.musicalstructure;

public class Song {
    private String songName;
    private String artistName = "Donald Glover";
    private String songDuration;

    public Song(String name, String duration) {
        songName = name;
        songDuration = duration;
    }

    public String getSongName() {
        String songNameFormatted = songName.substring(0,1).toUpperCase() + songName.substring(1);
        return songNameFormatted;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getSongDuration() {
        return songDuration;
    }
}
