package com.example.project.Phone;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.project.R;

public class CallActivity extends AppCompatActivity {
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        edit = findViewById(R.id.edt_num);
    }

    public void Call(View view) {
        Intent intentCall = new Intent();

        String telnum = edit.getText().toString();
        if (edit.equals("")) {
            //intentCall.setData(Uri.parse("tel:567788"));
            Toast.makeText(this, "Please Enter Num", Toast.LENGTH_LONG).show();
        } else {
            intentCall = new Intent(Intent.ACTION_CALL);
            intentCall.setData(Uri.parse("tel:" + telnum));
        }
        if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(getApplicationContext(), "Please grant permission", Toast.LENGTH_SHORT).show();
            requestPermission();
        } else {
            startActivity(intentCall);
        }
        edit.setText("");

    }

    private void requestPermission() {
        ActivityCompat.requestPermissions(CallActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
    }
}

