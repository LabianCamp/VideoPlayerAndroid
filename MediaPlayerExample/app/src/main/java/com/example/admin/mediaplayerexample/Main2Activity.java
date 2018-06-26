package com.example.admin.mediaplayerexample;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main2Activity extends AppCompatActivity {
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final VideoView videoView = findViewById(R.id.video);
        String videoUrl="http://clips.vorwaerts-gmbh.de/VfE_html5.mp4";
        Uri video = Uri.parse(videoUrl);
        videoView.setVideoURI(video);
        videoView.requestFocus();
        mediaController = new MediaController(Main2Activity.this);
        videoView.setMediaController(mediaController);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView.seekTo(0);
                videoView.start();

            }
        });
    }
}
