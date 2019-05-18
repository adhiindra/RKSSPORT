package com.example.rkssport;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    //Judul Body
    ArrayList <String> jBodym = new ArrayList<>();

    //Judul Beginer
    ArrayList <String> jBeginerm = new ArrayList<>();

    //Judul Advance
    ArrayList <String> jAdvancem = new ArrayList<>();

    //Judul Expert
    ArrayList <String> jExpertm = new ArrayList<>();

    //Data Body Pria
    ArrayList <String> bMonth1m = new ArrayList<>();
    ArrayList <String> bMonth2m = new ArrayList<>();
    ArrayList <String> bMonth3m = new ArrayList<>();

    //Data Body Wanita
    ArrayList <String> bMonth1w = new ArrayList<>();
    ArrayList <String> bMonth2w = new ArrayList<>();
    ArrayList <String> bMonth3w = new ArrayList<>();

    //Data Beginer Pria
    ArrayList <String> bgMonth1m = new ArrayList<>();
    ArrayList <String> bgMonth2m = new ArrayList<>();
    ArrayList <String> bgMonth3m = new ArrayList<>();

    //Data Beginer Wanita
    ArrayList <String> bgMonth1w = new ArrayList<>();
    ArrayList <String> bgMonth2w = new ArrayList<>();
    ArrayList <String> bgMonth3w = new ArrayList<>();

    //Data Advanced Pria
    ArrayList <String> aMonth1m = new ArrayList<>();
    ArrayList <String> aMonth2m = new ArrayList<>();
    ArrayList <String> aMonth3m = new ArrayList<>();

    //Data Advanced Pria
    ArrayList <String> aMonth1w = new ArrayList<>();
    ArrayList <String> aMonth2w = new ArrayList<>();
    ArrayList <String> aMonth3w = new ArrayList<>();

    //Data Expert Pria
    ArrayList <String> xMonth1m = new ArrayList<>();
    ArrayList <String> xMonth2m = new ArrayList<>();
    ArrayList <String> xMonth3m = new ArrayList<>();

    //Data Expert Wanita
    ArrayList <String> xMonth1w = new ArrayList<>();
    ArrayList <String> xMonth2w = new ArrayList<>();
    ArrayList <String> xMonth3w = new ArrayList<>();

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
        //Judul Body
        jBodym = sportData.getjBodym();

        //Judul Beginer
        jBeginerm = sportData.getjBeginerm();

        //Judul Advanced
        jAdvancem = sportData.getjAdvancem();

        //Judul Expert
        jExpertm = sportData.getjExpertm();

        //Data Body Pria
        bMonth1m = sportData.getbMonth1m();
        bMonth2m = sportData.getbMonth2m();
        bMonth3m = sportData.getbMonth3m();

        //Data Body Wanita
        bMonth1w = sportData.getbMonth1w();
        bMonth2w = sportData.getbMonth2w();
        bMonth3w = sportData.getbMonth3w();

        //Data Beginer Pria
        bgMonth1m = sportData.getaMonth1m();
        bgMonth2m = sportData.getaMonth2m();
        bgMonth3m = sportData.getaMonth3m();

        //Data Beginer Wanita
        bgMonth1w = sportData.getaMonth1w();
        bgMonth2w = sportData.getaMonth2w();
        bgMonth3w = sportData.getaMonth3w();

        //Data Advanced Pria
        aMonth1m = sportData.getaMonth1m();
        aMonth2m = sportData.getaMonth2m();
        aMonth3m = sportData.getaMonth3m();

        //Data Advanced Wanita
        aMonth1w = sportData.getaMonth1w();
        aMonth2w = sportData.getaMonth2w();
        aMonth3w = sportData.getaMonth3w();

        //Data Expert Pria
        xMonth1m = sportData.getxMonth1m();
        xMonth2m = sportData.getxMonth2m();
        xMonth3m = sportData.getxMonth3m();

        //Data Expert Pria
        xMonth1w = sportData.getxMonth1w();
        xMonth2w = sportData.getxMonth2w();
        xMonth3w = sportData.getxMonth3w();

        //Image
        mImageUrl = sportData.getmImageUrl();
        mImageUrl1 = sportData.getmImageUrl1();
        mImageUrl2 = sportData.getmImageUrl2();
        mQuotes = sportData.getmQuotes();
        mBody = sportData.getmBody();
        //Youtube
        lBody = sportData.getlBody();
        link3 = sportData.getLink3();
        link2 = sportData.getLink2();
        link1 = sportData.getLink1();


        initRecyclerView();
        initRecyclerView1();
        initRecyclerView2();
        initRecyclerViewQuotes();
        initRecyclerViewBody();
        click();


    }

    void click(){
        CardView card_view = (CardView) findViewById(R.id.card);
        CardView card_view1 = (CardView) findViewById(R.id.card1);
        CardView card_view2 = (CardView) findViewById(R.id.card2);
        CardView card_viewb = (CardView) findViewById(R.id.cardbody);

        card_viewb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putStringArrayListExtra("judul", jBodym);
                intent.putStringArrayListExtra("Month1m", bMonth1m);
                intent.putStringArrayListExtra("Month2m", bMonth2m);
                intent.putStringArrayListExtra("Month3m", bMonth3m);
                intent.putStringArrayListExtra("Month1w", bMonth1w);
                intent.putStringArrayListExtra("Month2w", bMonth2w);
                intent.putStringArrayListExtra("Month3w", bMonth3w);
                intent.putStringArrayListExtra("image_url", mBody);
                intent.putStringArrayListExtra("link1", lBody);
                startActivity(intent);
            }
        });

        card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putStringArrayListExtra("judul", jBeginerm);
                intent.putStringArrayListExtra("Month1m", bgMonth1m);
                intent.putStringArrayListExtra("Month2m", bgMonth2m);
                intent.putStringArrayListExtra("Month3m", bgMonth3m);
                intent.putStringArrayListExtra("Month1w", bgMonth1w);
                intent.putStringArrayListExtra("Month2w", bgMonth2w);
                intent.putStringArrayListExtra("Month3w", bgMonth3w);
                intent.putStringArrayListExtra("image_url", mImageUrl);
                intent.putStringArrayListExtra("link1", link1);
                startActivity(intent);
            }
        });

        card_view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putStringArrayListExtra("judul", jAdvancem);
                intent.putStringArrayListExtra("Month1m", aMonth1m);
                intent.putStringArrayListExtra("Month2m", aMonth2m);
                intent.putStringArrayListExtra("Month3m", aMonth3m);
                intent.putStringArrayListExtra("Month1w", aMonth1w);
                intent.putStringArrayListExtra("Month2w", aMonth2w);
                intent.putStringArrayListExtra("Month3w", aMonth3w);
                intent.putStringArrayListExtra("image_url", mImageUrl1);
                intent.putStringArrayListExtra("link1", link2);
                startActivity(intent);
            }
        });

        card_view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putStringArrayListExtra("judul", jExpertm);
                intent.putStringArrayListExtra("Month1m", xMonth1m);
                intent.putStringArrayListExtra("Month2m", xMonth2m);
                intent.putStringArrayListExtra("Month3m", xMonth3m);
                intent.putStringArrayListExtra("Month1w", xMonth1w);
                intent.putStringArrayListExtra("Month2w", xMonth2w);
                intent.putStringArrayListExtra("Month3w", xMonth3w);
                intent.putStringArrayListExtra("image_url", mImageUrl2);
                intent.putStringArrayListExtra("link1", link3);
                startActivity(intent);
            }
        });
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
        RecyclerViewAdapterB adapterB = new RecyclerViewAdapterB(this,jBodym,bMonth1m,bMonth2m,bMonth3m,bMonth1w,bMonth2w,bMonth3w,mBody,lBody);
        recyclerView.setAdapter(adapterB);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,jBeginerm,bgMonth1m,bgMonth2m,bgMonth3m,bgMonth1w,bgMonth2w,bgMonth3w, mImageUrl,link1);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }

    private void initRecyclerView1(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerview1);
        RecyclerViewAdapter2 adapter1 = new RecyclerViewAdapter2(this,jAdvancem,aMonth1m,aMonth2m,aMonth3m,aMonth1w,aMonth2w,aMonth3w, mImageUrl1,link2);
        recyclerView.setAdapter(adapter1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

    }

    private void initRecyclerView2(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerview2);
        RecyclerViewAdapter3 adapter2 = new RecyclerViewAdapter3(this,jExpertm,xMonth1m,xMonth2m,xMonth3m,xMonth1w,xMonth2w,xMonth3w, mImageUrl2,link3);
        recyclerView.setAdapter(adapter2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

    }



}
