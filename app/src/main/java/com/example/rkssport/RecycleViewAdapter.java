package com.example.rkssport;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mImageUrl= new ArrayList<>();
    private ArrayList<String> mDataUtama =  new ArrayList<>();

    private Context mContext;

    public RecycleViewAdapter(Context context, ArrayList<String> mImageUrl, ArrayList<String> mData1) {
        this.mImageUrl = mImageUrl;
        mContext = context;
        this.mDataUtama = mData1;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mImageUrl.get(position))
                .into(holder.sport);

        holder.sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " );

                Intent intent = new Intent(mContext, MainActivity2.class);
                intent.putStringArrayListExtra("image_url", mDataUtama);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return mImageUrl.size();
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
