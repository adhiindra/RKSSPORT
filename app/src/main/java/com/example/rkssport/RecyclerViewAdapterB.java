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
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapterB extends RecyclerView.Adapter<RecyclerViewAdapterB.ViewHolder> {
    private ArrayList<String> judul = new ArrayList<>();
    private ArrayList<String> Month1m = new ArrayList<>();
    private ArrayList<String> Month2m = new ArrayList<>();
    private ArrayList<String> Month3m = new ArrayList<>();
    private ArrayList<String> Month1w = new ArrayList<>();
    private ArrayList<String> Month2w = new ArrayList<>();
    private ArrayList<String> Month3w = new ArrayList<>();
    private ArrayList<String> mBody= new ArrayList<>();
    private ArrayList<String> lBody= new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapterB(Context context,ArrayList<String> judul,ArrayList<String> month1m, ArrayList<String> month2m, ArrayList<String> month3m,
                                ArrayList<String> month1w, ArrayList <String> month2w, ArrayList<String> month3w, ArrayList<String> mImageUrl , ArrayList<String> lbody) {
        this.judul = judul;
        this.Month1m = month1m;
        this.Month2m = month2m;
        this.Month3m = month3m;
        this.Month1w = month1w;
        this.Month2w = month2w;
        this.Month3w = month3w;
        this.mBody = mImageUrl;
        mContext = context;
        this.lBody = lbody;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal, parent, false);
        RecyclerViewAdapterB.ViewHolder holder = new RecyclerViewAdapterB.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterB.ViewHolder holder, final int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(mBody.get(position))
                .into(holder.sport);

        holder.sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, SportDetail.class);
                intent.putExtra("judul", judul.get(position));
                intent.putExtra("Month1m", Month1m.get(position));
                intent.putExtra("Month2m", Month2m.get(position));
                intent.putExtra("Month3m", Month3m.get(position));
                intent.putExtra("Month1w", Month1w.get(position));
                intent.putExtra("Month2w", Month2w.get(position));
                intent.putExtra("Month3w", Month3w.get(position));
                intent.putExtra("link1", lBody.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return mBody.size();
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
