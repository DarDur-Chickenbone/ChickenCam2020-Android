package com.snapchat.kit.chickencam;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Activity2 extends AppCompatActivity {

    private ImageButton buttonn;
    int TAKE_PHOTO_CODE = 0;
    public static int count = 0;
    ImageView imageView;
    Button btOpen;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        buttonn = (ImageButton) findViewById(R.id.buttonn);
        buttonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitymain();
            }
        });
    }

    public void openActivitymain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
