package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RoyaltyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_royalty);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Royalty", "0:09"));
        songs.add(new Song("We Ain't Them", "3:13"));
        songs.add(new Song("One Up", "2:32"));
        songs.add(new Song("Black Faces", "3:29"));
        songs.add(new Song("Unnecessary", "3:42"));
        songs.add(new Song("Shoulda Known", "3:42"));
        songs.add(new Song("R.I.P.", "3:55"));
        songs.add(new Song("American Royalty", "3:34"));
        songs.add(new Song("It May Be Glamour Life", "1:37"));
        songs.add(new Song("Toxic", "2:48"));
        songs.add(new Song("Silk Pillow", "4:10"));
        songs.add(new Song("They Don't Like Me", "2:15"));
        songs.add(new Song("Arrangement", "4:34"));
        songs.add(new Song("Won't Stop", "3:07"));
        songs.add(new Song("Bronchitis", "3:02"));
        songs.add(new Song("Wonderful", "3:05"));
        songs.add(new Song("Make It Go Right", "4:24"));
        songs.add(new Song("Real Estate", "5:52"));

        SongAdapter songsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songsAdapter);
    }
}
