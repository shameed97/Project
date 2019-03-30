package com.example.project.Wifi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.project.R;

public class WifiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);
    }

    public void wifilisttOperation(View view) {
        startActivity(new Intent(this, WifiInfoActivity.class));
    }

    public void wifiOperation(View view) {
        startActivity(new Intent(this, WifiStateActivity.class));
    }
}
