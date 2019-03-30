package com.example.project.Phone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.project.R;

public class EmailActivity extends AppCompatActivity {
    private EditText ed_to, ed_sub, ed_bod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        ed_to = findViewById(R.id.to_text);
        ed_sub = findViewById(R.id.sub_text);
        ed_bod = findViewById(R.id.body_text);
    }

    public void mailSend(View view) {
        String to = ed_to.getText().toString();
        String subject = ed_sub.getText().toString();
        String message = ed_bod.getText().toString();

        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.putExtra(Intent.EXTRA_SUBJECT, subject);
        email.putExtra(Intent.EXTRA_TEXT, message);
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
    }
}

