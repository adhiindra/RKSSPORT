package com.example.rkssport;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class SportDetail extends YouTubeBaseActivity {

    YouTubePlayerView mYoutubePlayerView;
    Button btnPlay;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    String link;
    //Data Man
    String judulm,month1m,month2m,month3m;
    //Data Wowan
    String month1w,month2w,month3w;


    private static final String TAG = "HotelDetail";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getIncomingIntent();
        click();
        Log.d(TAG, "onCreate: started.");
        btnPlay = (Button) findViewById(R.id.btn);
        mYoutubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube);


        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                youTubePlayer.loadVideo(link);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mYoutubePlayerView.initialize(YoutubeConfig.getApiKey(),mOnInitializedListener);
            }
        });


    }

    private void click(){
        final TextView textView2 = findViewById(R.id.textView2);
        final TextView textView = findViewById(R.id.cat);
        final TextView month1 = findViewById(R.id.month1);
        final TextView month2 = findViewById(R.id.month2);
        final TextView month3 = findViewById(R.id.month3);
        textView2.setText(judulm);
        month1.setText(month1m);
        month2.setText(month2m);
        month3.setText(month3m);
        Button button =  findViewById(R.id.button2);
        Button button1 = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                textView.setText("MAN");
                month1.setText(month1m);
                month2.setText(month2m);
                month3.setText(month3m);
            }
        });

        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                textView.setText("WOMAN");
                month1.setText(month1w);
                month2.setText(month2w);
                month3.setText(month3w);
            }
        });
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("link1") ){
            Log.d(TAG, "getIncomingIntent: found intent extras.");
            this.judulm = getIntent().getStringExtra("judul");
            this.month1m = getIntent().getStringExtra("Month1m");
            this.month2m = getIntent().getStringExtra("Month2m");
            this.month3m = getIntent().getStringExtra("Month3m");
            this.month1w = getIntent().getStringExtra("Month1w");
            this.month2w = getIntent().getStringExtra("Month2w");
            this.month3w = getIntent().getStringExtra("Month3w");
            this.link = getIntent().getStringExtra("link1");

        }
    }



}