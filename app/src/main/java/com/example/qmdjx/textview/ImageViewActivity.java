package com.example.qmdjx.textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView netImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        netImageView = findViewById(R.id.IV_2);
        Glide.with(this).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1530017790764&di=5de95728df72e0605106e8bda328b99b&imgtype=0&src=http%3A%2F%2Fwww.taopic.com%2Fuploads%2Fallimg%2F140313%2F235026-1403130Z43831.jpg").into(netImageView);
    }
}
