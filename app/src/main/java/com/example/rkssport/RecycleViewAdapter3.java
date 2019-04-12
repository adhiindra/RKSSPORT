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

public class RecycleViewAdapter3 extends RecyclerView.Adapter<RecycleViewAdapter3.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mImageUrl2= new ArrayList<>();

    private Context mContext;

    public RecycleViewAdapter3(Context context, ArrayList<String> mImageUrl1) {
        this.mImageUrl2 = mImageUrl1;
        mContext = context;
    }

    @NonNull
    @Override
    public RecycleViewAdapter3.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal, parent, false);
        RecycleViewAdapter3.ViewHolder holder = new RecycleViewAdapter3.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewAdapter3.ViewHolder holder,final int position) {
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
                intent.putExtra("image_url", mImageUrl2.get(position));
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
