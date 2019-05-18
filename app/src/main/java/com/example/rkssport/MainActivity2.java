package com.example.rkssport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "HotelDetail";
    private ArrayList<String> judul = new ArrayList<>();
    private ArrayList<String> Month1m = new ArrayList<>();
    private ArrayList<String> Month2m = new ArrayList<>();
    private ArrayList<String> Month3m = new ArrayList<>();
    private ArrayList<String> Month1w = new ArrayList<>();
    private ArrayList<String> Month2w = new ArrayList<>();
    private ArrayList<String> Month3w = new ArrayList<>();
    private ArrayList<String> mImageUrl= new ArrayList<>();
    private ArrayList<String> link =  new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getIncomingIntent();
        initRecyclerViewQuotes();

    }

    private void initRecyclerViewQuotes(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.rv_category);
        RecyclerViewGrid adapterGrid = new RecyclerViewGrid(this,judul,Month1m,Month2m,Month3m,Month1w,Month2w,Month3w, mImageUrl,link);
        recyclerView.setAdapter(adapterGrid);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }


    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("link1") ){
            Log.d(TAG, "getIncomingIntent: found intent extras.");
            this.judul = getIntent().getStringArrayListExtra("judul");
            this.Month1m = getIntent().getStringArrayListExtra("Month1m");
            this.Month2m = getIntent().getStringArrayListExtra("Month2m");
            this.Month3m = getIntent().getStringArrayListExtra("Month3m");
            this.Month1w = getIntent().getStringArrayListExtra("Month1w");
            this.Month2w = getIntent().getStringArrayListExtra("Month2w");
            this.Month3w = getIntent().getStringArrayListExtra("Month3w");
            this.link = getIntent().getStringArrayListExtra("link1");
            this.mImageUrl = getIntent().getStringArrayListExtra("image_url");

        }
    }
}
