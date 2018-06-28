package com.example.qmdjx.textview.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.qmdjx.textview.R;

public class HorAdapter extends RecyclerView.Adapter<HorAdapter.LinearViewHolder> {

    private Context mContext;
    private OnItemClickListener mListener;


    public HorAdapter(Context mContext, OnItemClickListener listener) {
        this.mContext = mContext;
        this.mListener = listener;
    }


    @NonNull
    @Override
    public HorAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {



        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_hor_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HorAdapter.LinearViewHolder viewHolder, final int i) {
        viewHolder.textView.setText("kankan");
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

        public LinearViewHolder(View itemView) {
            super(itemView);
                textView = itemView.findViewById(R.id.linear_rv_title);
        }
    }

    public interface OnItemClickListener {
        void onClick(int pos);

    }


}
