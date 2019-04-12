package com.example.rkssport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "SportDetail";

    private ArrayList<String> mData1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("image_url") ){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            mData1 = getIntent().getStringArrayListExtra("image_url");

            initRecyclerView(mData1);

        }
    }

    private void initRecyclerView(ArrayList<String> data1){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerview5);
        RecycleViewAdapterMA2 adapter = new RecycleViewAdapterMA2(this, data1);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
