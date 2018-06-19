package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BecauseTheInternetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_because_the_internet);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("the library(intro)", "0:04"));
        songs.add(new Song("I. Crawl", "3:29"));
        songs.add(new Song("II. Worldstar", "4:04"));
        songs.add(new Song("Dial up", "0:44"));
        songs.add(new Song("I. The Worst Guys", "3:39"));
        songs.add(new Song("II. Shadows", "3:51"));
        songs.add(new Song("III. Telegraph Ave. (\"Oakland\" by Lloyd)", "3:30"));
        songs.add(new Song("IV. Sweatpants", "3:00"));
        songs.add(new Song("V. 3005", "3:54"));
        songs.add(new Song("Playing Around Before the Party Starts", "0:54"));
        songs.add(new Song("I. The Party", "1:31"));
        songs.add(new Song("II. No Exit", "2:51"));
        songs.add(new Song("Death by Numbers", "0.43"));
        songs.add(new Song("I. Flight of the Navigator", "5:44"));
        songs.add(new Song("II. Zealots of Stockholm (Free Information)", "4:50"));
        songs.add(new Song("III. Urn", "1:13"));
        songs.add(new Song("I. Pink Toes [Explicit]", "3:27"));
        songs.add(new Song("Earth: The Oldest Computer (The Last Night)", "4:42"));
        songs.add(new Song("Life: The Biggest Troll (Andrew Auernheimer)", "5:42"));

        SongAdapter songsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songsAdapter);
    }
}
