package com.example.rkssport;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class SportDetail extends AppCompatActivity {

    private static final String TAG = "HotelDetail";
    public String boking;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("image_url") ){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String imageUrl = getIntent().getStringExtra("image_url");

            setImage(imageUrl);

        }
    }


    private void setImage(String imageUrl){
        Log.d(TAG, "setImage: setting te image and name to widgets.");


        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }


}
