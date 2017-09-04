package com.test.lessons;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.image_iv);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.image);
        imageView.setImageBitmap(bitmap);
    }

}
