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
        RecyclerViewGrid adapterGrid = new RecyclerViewGrid(this, mImageUrl,link);
        recyclerView.setAdapter(adapterGrid);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }


    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("link1") ){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            this.link = getIntent().getStringArrayListExtra("link1");
            this.mImageUrl = getIntent().getStringArrayListExtra("image_url");

        }
    }
}
