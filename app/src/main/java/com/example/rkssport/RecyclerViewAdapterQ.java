package com.example.rkssport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapterQ extends RecyclerView.Adapter<RecyclerViewAdapterQ.ViewHolder> {

    private ArrayList<String> mQuotes= new ArrayList<>();


    private Context mContext;

    public RecyclerViewAdapterQ(Context context, ArrayList<String> mImageUrl) {
        this.mQuotes = mImageUrl;
        mContext = context;

    }

    @NonNull
    @Override
    public RecyclerViewAdapterQ.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal, parent, false);
        RecyclerViewAdapterQ.ViewHolder holder = new RecyclerViewAdapterQ.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterQ.ViewHolder holder, int position) {

        Glide.with(mContext)
                .asBitmap()
                .load(mQuotes.get(position))
                .into(holder.sport);


    }

    @Override
    public int getItemCount() {
        return mQuotes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView sport;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            sport = itemView.findViewById(R.id.sport);
        }
    }
}
