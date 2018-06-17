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

        // attach event listener to numbers TextView
        ImageView awakenMyLoveActiviy = (ImageView) findViewById(R.id.record1);
        awakenMyLoveActiviy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberActivityIntent = new Intent(MainActivity.this, AwakenMyLoveActivity.class);
                startActivity(numberActivityIntent);
            }
        });
    }
}
