package com.example.rkssport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mImageUrls1 = new ArrayList<>();
    private ArrayList<String> mImageUrls2 = new ArrayList<>();

    private ArrayList<String> mData1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started");

        SportData sportData = new SportData();
        sportData.setData();
        mImageUrls = sportData.getmImageUrl();
        mImageUrls1 = sportData.getmImageUrl1();
        mImageUrls2 = sportData.getmImageUrl2();
        mData1 = sportData.getmData1();
        initRecyclerView();
        initRecyclerView1();
        initRecyclerView2();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, mImageUrls,mData1);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }

    private void initRecyclerView1(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view1);
        RecycleViewAdapter2 adapter1 = new RecycleViewAdapter2(this, mImageUrls1);
        recyclerView.setAdapter(adapter1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

    }

    private void initRecyclerView2(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view2);
        RecycleViewAdapter3 adapter2 = new RecycleViewAdapter3(this, mImageUrls2);
        recyclerView.setAdapter(adapter2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

    }

}
