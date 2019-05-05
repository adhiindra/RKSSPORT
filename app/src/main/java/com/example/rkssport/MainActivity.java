package com.example.rkssport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    //URL FOTO
    ArrayList <String> mQuotes = new ArrayList<>(); //Quotes
    ArrayList <String> mBody = new ArrayList<>(); //Body
    ArrayList <String> mImageUrl = new ArrayList<>(); //Beginer
    ArrayList <String> mImageUrl1 = new ArrayList<>(); //Advance
    ArrayList <String> mImageUrl2 = new ArrayList<>(); //Expert

    //Link Youtube
    ArrayList <String> lBody = new ArrayList<>(); //Body
    ArrayList <String> link1 = new ArrayList<>(); //Beginer
    ArrayList <String> link2 = new ArrayList<>(); //Advance
    ArrayList <String> link3 = new ArrayList<>(); //Expert


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started");

        SportData sportData = new SportData();
        sportData.setData();
        mImageUrl = sportData.getmImageUrl();
        mImageUrl1 = sportData.getmImageUrl1();
        mImageUrl2 = sportData.getmImageUrl2();
        mQuotes = sportData.getmQuotes();
        mBody = sportData.getmBody();
        lBody = sportData.getlBody();
        link3 = sportData.getLink3();
        link2 = sportData.getLink2();
        link1 = sportData.getLink1();


        initRecyclerView();
        initRecyclerView1();
        initRecyclerView2();
        initRecyclerViewQuotes();
        initRecyclerViewBody();


    }

    private void initRecyclerViewQuotes(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.quotes);
        RecyclerViewAdapterQ adapterQ = new RecyclerViewAdapterQ(this, mQuotes);
        recyclerView.setAdapter(adapterQ);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }

    private void initRecyclerViewBody(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.body);
        RecyclerViewAdapterB adapterB = new RecyclerViewAdapterB(this, mBody,lBody);
        recyclerView.setAdapter(adapterB);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mImageUrl,link1);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }

    private void initRecyclerView1(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerview1);
        RecyclerViewAdapter2 adapter1 = new RecyclerViewAdapter2(this, mImageUrl1,link2);
        recyclerView.setAdapter(adapter1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

    }

    private void initRecyclerView2(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerview2);
        RecyclerViewAdapter3 adapter2 = new RecyclerViewAdapter3(this, mImageUrl2,link3);
        recyclerView.setAdapter(adapter2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

    }



}
