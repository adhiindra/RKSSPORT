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
    private ArrayList<String> mBody= new ArrayList<>();
    private ArrayList<String> lBody= new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapterB(Context context, ArrayList<String> mImageUrl , ArrayList<String> lbody) {
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
