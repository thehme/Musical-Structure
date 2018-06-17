package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // attach event listener to record ImageView
        ImageView awakenMyLoveActiviy = (ImageView) findViewById(R.id.record1);
        awakenMyLoveActiviy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityIntent = new Intent(MainActivity.this, AwakenMyLoveActivity.class);
                startActivity(activityIntent);
            }
        });
        ImageView becauseTheInternetActivity = (ImageView) findViewById(R.id.record2);
        becauseTheInternetActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityIntent = new Intent(MainActivity.this, BecauseTheInternetActivity.class);
                startActivity(activityIntent);
            }
        });
        ImageView campActivity = (ImageView) findViewById(R.id.record3);
        campActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityIntent = new Intent(MainActivity.this, CampActivity.class);
                startActivity(activityIntent);
            }
        });
        ImageView kauaiActivity = (ImageView) findViewById(R.id.record4);
        kauaiActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityIntent = new Intent(MainActivity.this, KauaiActivity.class);
                startActivity(activityIntent);
            }
        });
        ImageView mmxxlActivity = (ImageView) findViewById(R.id.record5);
        mmxxlActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityIntent = new Intent(MainActivity.this, MmxxlActivity.class);
                startActivity(activityIntent);
            }
        });
        ImageView americaActivity = (ImageView) findViewById(R.id.record6);
        americaActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityIntent = new Intent(MainActivity.this, ThisIsAmericaActivity.class);
                startActivity(activityIntent);
            }
        });
        ImageView royaltyActivity = (ImageView) findViewById(R.id.record7);
        royaltyActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityIntent = new Intent(MainActivity.this, RoyaltyActivity.class);
                startActivity(activityIntent);
            }
        });
        ImageView epActivity = (ImageView) findViewById(R.id.record8);
        epActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityIntent = new Intent(MainActivity.this, RoyaltyActivity.class);
                startActivity(activityIntent);
            }
        });
    }
}
