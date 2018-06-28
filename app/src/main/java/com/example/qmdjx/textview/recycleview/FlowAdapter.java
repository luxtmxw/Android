package com.example.qmdjx.textview.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.qmdjx.textview.R;

public class FlowAdapter extends RecyclerView.Adapter<FlowAdapter.LinearViewHolder> {

    private Context mContext;
    private OnItemClickListener mListener;


    public FlowAdapter(Context mContext, OnItemClickListener listener) {
        this.mContext = mContext;
        this.mListener = listener;
    }


    @NonNull
    @Override
    public FlowAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {



        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_flow_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FlowAdapter.LinearViewHolder viewHolder, final int i) {

        if (i%2 == 0) {
            viewHolder.iv.setImageResource(R.drawable.image1);
        } else {
            viewHolder.iv.setImageResource(R.drawable.image2);
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onClick(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv;

        public LinearViewHolder(View itemView) {
            super(itemView);
                iv = itemView.findViewById(R.id.rv_flow_iv);
        }
    }

    public interface OnItemClickListener {
        void onClick(int pos);

    }


}
