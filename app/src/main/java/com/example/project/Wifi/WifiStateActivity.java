package com.example.project.Wifi;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.project.R;

public class WifiStateActivity extends AppCompatActivity {
    private Button enableWIFI, disableWIFI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi_state);
        enableWIFI =findViewById(R.id.btnwifion);
        disableWIFI =findViewById(R.id.btnwifioff);

        enableWIFI.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(true);
                Toast.makeText(getApplicationContext(), "WIFI On", Toast.LENGTH_SHORT).show();
            }
        });

        disableWIFI.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(false);
                Toast.makeText(getApplicationContext(), "WIFI Off", Toast.LENGTH_SHORT).show();
            }
        });
    }

}

