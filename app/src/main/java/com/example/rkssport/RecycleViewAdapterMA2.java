package com.example.rkssport;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecycleViewAdapterMA2 extends RecyclerView.Adapter<RecycleViewAdapterMA2.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mData1 =  new ArrayList<>();

    private Context mContext;

    public RecycleViewAdapterMA2(Context context, ArrayList<String> mData1) {
        mContext = context;
        this.mData1 = mData1;
    }

    @Override
    public RecycleViewAdapterMA2.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal, parent, false);
        RecycleViewAdapterMA2.ViewHolder holder = new RecycleViewAdapterMA2.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecycleViewAdapterMA2.ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mData1.get(position))
                .into(holder.sport);

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " );

                Intent intent = new Intent(mContext, SportDetail.class);
                intent.putExtra("image_url", mData1.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return mData1.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView sport;
        LinearLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            sport = itemView.findViewById(R.id.sport);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
