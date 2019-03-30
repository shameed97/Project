package com.example.project.Phone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.project.Phone.CallActivity;
import com.example.project.Phone.ContactActivity;
import com.example.project.Phone.DetailsActivity;
import com.example.project.Phone.EmailActivity;
import com.example.project.R;

public class PhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

    }

    public void callOperation(View view) {
        startActivity(new Intent(this, CallActivity.class));


    }

    public void contactOperation(View view) {
        startActivity(new Intent(this, ContactActivity.class));
    }

    public void detailsOperation(View view) {
        startActivity(new Intent(this, DetailsActivity.class));
    }

    public void emailOperation(View view) {
        startActivity(new Intent(this, EmailActivity.class));
    }
}

