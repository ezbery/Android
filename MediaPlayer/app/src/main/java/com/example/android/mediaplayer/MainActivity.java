package com.example.android.mediaplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer audio1MediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audio1MediaPlayer = MediaPlayer.create(this, R.raw.audio_1);

        // Find the View
        Button playButton = (Button) findViewById(R.id.playButton);
        Button pauseButton = (Button) findViewById(R.id.pauseButton);

        // Set a click listeners
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                //startActivity(colorsIntent);
                audio1MediaPlayer.start();
                audio1MediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        Toast.makeText(MainActivity.this, "done playing", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        // Set a click listeners
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                //startActivity(colorsIntent);
                audio1MediaPlayer.pause();
            }
        });
    }
}
