package com.example.project.Media;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.project.R;

public class CameraActivity extends AppCompatActivity {
    private ImageView img;
    private static final int CAMERA_REQUEST = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);


    }

    public void clickImage(View view) {
        img = findViewById(R.id.cap_img);
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
       try {
           startActivityForResult(cameraIntent, CAMERA_REQUEST);
       }catch (Exception e){
           Log.d("sha",e.toString());
       }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            img.setImageBitmap(photo);
        }
    }
}
