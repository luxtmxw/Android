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

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.LinearViewHolder> {

    private Context mContext;
    private OnItemClickListener mListener;


    public GridAdapter(Context mContext, OnItemClickListener listener) {
        this.mContext = mContext;
        this.mListener = listener;
    }


    @NonNull
    @Override
    public GridAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {



        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_rv_grid_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GridAdapter.LinearViewHolder viewHolder, final int i) {
        viewHolder.textView.setText("kankan");
        Glide.with(mContext).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1530017790764&di=5de95728df72e0605106e8bda328b99b&imgtype=0&src=http%3A%2F%2Fwww.taopic.com%2Fuploads%2Fallimg%2F140313%2F235026-1403130Z43831.jpg").into(viewHolder.iv);
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

        private TextView textView;
        private ImageView iv;

        public LinearViewHolder(View itemView) {
            super(itemView);
                textView = itemView.findViewById(R.id.rv_grid_title);
                iv = itemView.findViewById(R.id.rv_grid_iv);
        }
    }

    public interface OnItemClickListener {
        void onClick(int pos);

    }


}
