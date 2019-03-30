package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.project.Alarm.AlarmActivity;
import com.example.project.Browser.BrowserActivity;
import com.example.project.Calculator.CalcActivity;
import com.example.project.Flash.FlashActivity;
import com.example.project.Map.MapsActivity;
import com.example.project.Media.MediaActivity;
import com.example.project.PDF.NoteActivity;
import com.example.project.Phone.PhoneActivity;
import com.example.project.Voice.SpeachActivity;
import com.example.project.Wifi.WifiActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void phoneFunctions(View view) {
        Intent intent = new Intent(this, PhoneActivity.class);
        startActivity(intent);
    }

    public void alarmFunction(View view) {
        startActivity(new Intent(this, AlarmActivity.class));
    }

    public void mediaFunction(View view) {
        startActivity(new Intent(this, MediaActivity.class));
    }

    public void editFunction(View view) {
        startActivity(new Intent(this, NoteActivity.class));
    }

    public void mapFunction(View view) {
        startActivity(new Intent(this, MapsActivity.class));
    }

    public void browserFunction(View view) {
        startActivity(new Intent(this, BrowserActivity.class));
    }

    public void lightFunction(View view) {
        startActivity(new Intent(this, FlashActivity.class));
    }

    public void speachFunction(View view) {
        startActivity(new Intent(this, SpeachActivity.class));
    }

    public void WifiFunction(View view) {
        startActivity(new Intent(this, WifiActivity.class));
    }

    public void calcFunction(View view) {
        startActivity(new Intent(this, CalcActivity.class));
    }
}



