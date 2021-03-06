package com.example.dell.web;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;


public class Video extends AppCompatActivity {
ImageButton mRecordView;
    ImageButton mPlayView;

    private VideoView mVideoView;
    private int ACTIVITY_START_CAMERA = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        mRecordView = (ImageButton) findViewById(R.id.recordButton);
        mPlayView = (ImageButton) findViewById(R.id.playButton);
        mVideoView = (VideoView) findViewById(R.id.Videoview);

        mRecordView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent callVideoAppIntent = new Intent();
                callVideoAppIntent.setAction(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivityForResult(callVideoAppIntent, ACTIVITY_START_CAMERA);
            }

        });
        mPlayView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVideoView.start();
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == ACTIVITY_START_CAMERA && resultCode == RESULT_OK) {
            Uri videoUri = data.getData();
            mVideoView.setVideoURI(videoUri);

        }

    }


}
