package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ep);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Be Alone", "4:40"));
        songs.add(new Song("Freaks and Geeks", "3:37"));
        songs.add(new Song("My Shine", "3:29"));
        songs.add(new Song("Lights Turned On", "3:50"));
        songs.add(new Song("Not Going Back", "4:40"));

        SongAdapter songsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songsAdapter);
    }
}
