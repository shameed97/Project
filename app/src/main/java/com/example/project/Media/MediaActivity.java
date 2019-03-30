package com.example.project.Media;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.project.R;

public class MediaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);
    }

    public void cameraOperation(View view) {
        startActivity(new Intent(this, CameraActivity.class));
    }

    public void VideoOperation(View view) {
        startActivity(new Intent(this, VideoActivity.class));
    }

    public void VoiceOperation(View view) {
        startActivity(new Intent(this, RecordActivity.class));
    }
}
