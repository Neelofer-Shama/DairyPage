package com.example.dell.web;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

import static com.example.dell.web.R.drawable.bg1;

public class Wallpaper extends AppCompatActivity implements View.OnClickListener {
ImageView display;
    int toApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wallpaper);
        toApp = R.drawable.bg;
display = (ImageView)findViewById(R.id.ivdisplay);

        ImageView image1 = (ImageView)findViewById(R.id.ivimage1);
        ImageView image2 = (ImageView)findViewById(R.id.ivimage2);
        ImageView image3 = (ImageView)findViewById(R.id.ivimage3);
        ImageView image4 = (ImageView)findViewById(R.id.ivimage4);
        ImageView image5 = (ImageView)findViewById(R.id.ivimage5);
        Button setwall = (Button) findViewById(R.id.BsetWallpaper);
        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image5.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
     switch (v.getId()){
         case R.id.ivimage1:
             display.setImageResource(bg1);
             toApp = R.drawable.bg1;
             break;
         case R.id.ivimage2:
             display.setImageResource(R.drawable.bg2);
             toApp = R.drawable.bg2;
             break;
         case R.id.ivimage3:
             display.setImageResource(R.drawable.bg3);
             toApp = R.drawable.bg3;
             break;
         case R.id.ivimage4:
             display.setImageResource(R.drawable.bg4);toApp = R.drawable.bg4;
             break;
         case R.id.ivimage5:
             display.setImageResource(R.drawable.bg5);
             toApp = R.drawable.bg5;
             break;
         case R.id.BsetWallpaper:
           InputStream yea = getResources().openRawResource(R.drawable.bg);
                 Bitmap whatever = BitmapFactory.decodeStream(yea);
             try {
                 getApplicationContext().setWallpaper(whatever);

             } catch (IOException e) {
                 e.printStackTrace();
             }
             break;
     }
    }
}
