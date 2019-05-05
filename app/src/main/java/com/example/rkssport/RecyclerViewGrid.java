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

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class RecyclerViewGrid extends RecyclerView.Adapter<RecyclerViewGrid.ViewHolder> {

    ArrayList <String> mImageUrl = new ArrayList<>();
    ArrayList <String> link = new ArrayList<>();
    private Context mContext;

    public RecyclerViewGrid(Context context, ArrayList<String> mImageUrl, ArrayList<String> mData1) {
        this.mImageUrl = mImageUrl;
        mContext = context;
        this.link = mData1;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_grid, parent, false);
        RecyclerViewGrid.ViewHolder holder = new RecyclerViewGrid.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewGrid.ViewHolder holder, final int position) {

        Glide.with(mContext)
                .asBitmap()
                .load(mImageUrl.get(position))
                .apply(new RequestOptions().override(550, 550))
                .into(holder.sport);

        holder.sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, SportDetail.class);
                intent.putExtra("link1", link.get(position));
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mImageUrl.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView sport;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            sport = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
