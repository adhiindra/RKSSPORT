package com.example.rkssport;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter2 extends RecyclerView.Adapter<RecyclerViewAdapter2.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> judul = new ArrayList<>();
    private ArrayList<String> Month1m = new ArrayList<>();
    private ArrayList<String> Month2m = new ArrayList<>();
    private ArrayList<String> Month3m = new ArrayList<>();
    private ArrayList<String> Month1w = new ArrayList<>();
    private ArrayList<String> Month2w = new ArrayList<>();
    private ArrayList<String> Month3w = new ArrayList<>();
    private ArrayList<String> mImageUrl1= new ArrayList<>();
    private ArrayList<String> mDataUtama= new ArrayList<>();

    private Context mContext;

    public RecyclerViewAdapter2(Context context,ArrayList<String> judul,ArrayList<String> month1m, ArrayList<String> month2m, ArrayList<String> month3m,
                                ArrayList<String> month1w, ArrayList <String> month2w, ArrayList<String> month3w, ArrayList<String> mImageUrl,
                                ArrayList<String> mData1) {
        this.judul = judul;
        this.Month1m = month1m;
        this.Month2m = month2m;
        this.Month3m = month3m;
        this.Month1w = month1w;
        this.Month2w = month2w;
        this.Month3w = month3w;
        this.mImageUrl1 = mImageUrl;
        mContext = context;
        this.mDataUtama = mData1;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal, parent, false);
        RecyclerViewAdapter2.ViewHolder holder = new RecyclerViewAdapter2.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mImageUrl1.get(position))
                .into(holder.sport);

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " );

                Intent intent = new Intent(mContext, SportDetail.class);
                intent.putExtra("judul", judul.get(position));
                intent.putExtra("Month1m", Month1m.get(position));
                intent.putExtra("Month2m", Month2m.get(position));
                intent.putExtra("Month3m", Month3m.get(position));
                intent.putExtra("Month1w", Month1w.get(position));
                intent.putExtra("Month2w", Month2w.get(position));
                intent.putExtra("Month3w", Month3w.get(position));
                intent.putExtra("link1", mDataUtama.get(position));
                mContext.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return mImageUrl1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView sport;
        LinearLayout parentLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            sport = itemView.findViewById(R.id.sport);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
