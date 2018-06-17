package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AwakenMyLoveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awaken_my_love);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("me and your mama", "6:19"));
        songs.add(new Song("have some love", "3:44"));
        songs.add(new Song("boogieman", "3:37"));
        songs.add(new Song("zombies", "4:42"));
        songs.add(new Song("riot", "2:05"));
        songs.add(new Song("redbone", "5:27"));
        songs.add(new Song("california", "2:45"));
        songs.add(new Song("terrified", "4:15"));
        songs.add(new Song("baby boy", "6:22"));
        songs.add(new Song("the night me and your mama met", "3:34"));
        songs.add(new Song("stand tall", "6:11"));

        SongAdapter songsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songsAdapter);
    }
}
