package com.example.qmdjx.textview.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.qmdjx.textview.R;

public class LinearAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private OnItemClickListener mListener;


    public LinearAdapter(Context mContext, OnItemClickListener listener) {
        this.mContext = mContext;
        this.mListener = listener;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        if (i == 1) {
            return new LinearViewHolder2(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item_2,viewGroup,false));
        }

        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        if (getItemViewType(i) == 0) {
            ((LinearViewHolder)viewHolder).textView.setText("hello");
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mListener.onClick(i);
                }
            });
        } else {
            ((LinearViewHolder2)viewHolder).textView.setText("こんにちは");
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mListener.onClick(i);
                }
            });
        }

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

    class LinearViewHolder2 extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView iv;

        public LinearViewHolder2(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.linear_rv2_title);
            iv = itemView.findViewById(R.id.linear_rv2_iv);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position %2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public interface OnItemClickListener {
        void onClick(int pos);

    }


}
