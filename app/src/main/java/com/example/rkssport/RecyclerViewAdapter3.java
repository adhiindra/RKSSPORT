package com.example.rkssport;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter3 extends RecyclerView.Adapter<RecyclerViewAdapter3.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> judul = new ArrayList<>();
    private ArrayList<String> Month1m = new ArrayList<>();
    private ArrayList<String> Month2m = new ArrayList<>();
    private ArrayList<String> Month3m = new ArrayList<>();
    private ArrayList<String> Month1w = new ArrayList<>();
    private ArrayList<String> Month2w = new ArrayList<>();
    private ArrayList<String> Month3w = new ArrayList<>();
    private ArrayList<String> mImageUrl2= new ArrayList<>();
    private ArrayList<String> link3 = new ArrayList<>();

    private Context mContext;

    public RecyclerViewAdapter3(Context context,ArrayList<String> judul,ArrayList<String> month1m, ArrayList<String> month2m, ArrayList<String> month3m,
                                ArrayList<String> month1w, ArrayList <String> month2w, ArrayList<String> month3w, ArrayList<String> mImageUrl1,
                                ArrayList<String> link3) {
        this.judul = judul;
        this.Month1m = month1m;
        this.Month2m = month2m;
        this.Month3m = month3m;
        this.Month1w = month1w;
        this.Month2w = month2w;
        this.Month3w = month3w;
        this.mImageUrl2 = mImageUrl1;
        mContext = context;
        this.link3 = link3;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter3.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal, parent, false);
        RecyclerViewAdapter3.ViewHolder holder = new RecyclerViewAdapter3.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter3.ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mImageUrl2.get(position))
                .into(holder.sport);

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " );

                Intent intent = new Intent(mContext, SportDetail.class);
                intent.putExtra("judul", judul.get(position));
                intent.putExtra("Month3w", Month3w.get(position));
                intent.putExtra("Month1m", Month1m.get(position));
                intent.putExtra("Month2m", Month2m.get(position));
                intent.putExtra("Month3m", Month3m.get(position));
                intent.putExtra("Month1w", Month1w.get(position));
                intent.putExtra("Month2w", Month2w.get(position));
                intent.putExtra("link1", link3.get(position));
                mContext.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return mImageUrl2.size();
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
