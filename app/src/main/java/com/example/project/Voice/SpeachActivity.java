package com.example.project.Voice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.project.R;

public class SpeachActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speach);
    }

    public void TextFunction(View view) {
        startActivity(new Intent(this, TextActivity.class));
    }

    public void VoiceFunction(View view) {
        startActivity(new Intent(this, VoiceActivity.class));
    }
}
