package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class KauaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kauai);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Sober", "4:12"));
        songs.add(new Song("Pop Thieves (Make it Feel Good", "5:09"));
        songs.add(new Song("Retro [ROUGH][Explicit]", "3:23"));
        songs.add(new Song("The Palisades", "3:11"));
        songs.add(new Song("Poke", "3:36"));
        songs.add(new Song("Late Night in Kauai", "4:50"));
        songs.add(new Song("V. 3005 (Beach Picnic Version)", "3:46"));

        SongAdapter songsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songsAdapter);
    }
}
