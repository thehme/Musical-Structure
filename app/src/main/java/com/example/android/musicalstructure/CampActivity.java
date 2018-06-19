package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CampActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camp);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Outside", "4:30"));
        songs.add(new Song("Fire Fly", "3:23"));
        songs.add(new Song("Bonfire", "3:13"));
        songs.add(new Song("All the Shine", "5:46"));
        songs.add(new Song("Letter Home", "1:44"));
        songs.add(new Song("Heartbeat", "4:30"));
        songs.add(new Song("Backpackers", "3:16"));
        songs.add(new Song("L.E.S.", "5:18"));
        songs.add(new Song("Hold You Down", "4:52"));
        songs.add(new Song("Kids (Keep Up", "4:57"));
        songs.add(new Song("You See Me", "3:14"));
        songs.add(new Song("Sunrise", "3:40"));
        songs.add(new Song("That Power", "7:42"));

        SongAdapter songsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songsAdapter);
    }
}
