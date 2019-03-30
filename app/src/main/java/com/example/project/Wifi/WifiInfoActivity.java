package com.example.project.Wifi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.project.R;

public class WifiInfoActivity extends AppCompatActivity {

    private TextView textWifiInfo;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi_info);
        textWifiInfo = findViewById(R.id.txtdisp);
        String strWifiInfo = "";
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();

        int ipAddress = connectionInfo.getIpAddress();
        @SuppressLint("DefaultLocale") String ipString = String.format("%d.%d.%d.%d",
                (ipAddress & 0xff),
                (ipAddress >> 8 & 0xff),
                (ipAddress >> 16 & 0xff),
                (ipAddress >> 24 & 0xff));

        final int NumOfRSSILevels = 5;

        strWifiInfo +=
                "SSID: " + connectionInfo.getSSID() + "\n" +
                        "BSSID: " + connectionInfo.getBSSID() + "\n" +
                        "IP Address: " + ipString + "\n" +
                        "MAC Address: " + connectionInfo.getMacAddress() + "\n" +
                        "Frequency: " + connectionInfo.getFrequency() + WifiInfo.FREQUENCY_UNITS + "\n" +
                        "LinkSpeed: " + connectionInfo.getLinkSpeed() + WifiInfo.LINK_SPEED_UNITS + "\n" +
                        "Rssi: " + connectionInfo.getRssi() + "dBm" + "\n" +
                        "Rssi Level: " + WifiManager.calculateSignalLevel(connectionInfo.getRssi(), NumOfRSSILevels) + " of " + NumOfRSSILevels;
        textWifiInfo.setText(strWifiInfo);
    }

}

