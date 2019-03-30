package com.example.project.Voice;

import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.project.R;

import java.util.Locale;

public class TextActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {
    private TextToSpeech tts;
    private EditText edit;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        tts = new TextToSpeech(TextActivity.this, this);
        edit = findViewById(R.id.text_edit);
        button = findViewById(R.id.btn);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void convertSpeach(View view) {
        voiceOutput();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void voiceOutput() {
        CharSequence text = edit.getText();
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, "id1");
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            //set language, you can change to any built in language given we are using US language locale
            int result = tts.setLanguage(Locale.US);
            float i = 50;
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Toast.makeText(TextActivity.this, "Language not supported!", Toast.LENGTH_SHORT).show();
            } else {
                button.setEnabled(true);
                voiceOutput();
            }
        } else {
            Toast.makeText(TextActivity.this, "Initilization failed!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onDestroy() {
        //shutdown TextToSpeech
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}

