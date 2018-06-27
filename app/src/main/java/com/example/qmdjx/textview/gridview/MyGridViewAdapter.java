package com.example.qmdjx.textview.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.qmdjx.textview.R;

public class MyGridViewAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyGridViewAdapter(Context context) {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class ViewHolder {
        public ImageView imageView;
        public TextView textView;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (view == null) {
            view = mLayoutInflater.inflate(R.layout.layout_grid_item,null);
            holder = new ViewHolder();
            holder.imageView = view.findViewById(R.id.grid_iv);
            holder.textView = view.findViewById(R.id.grid_tv_title);
            view.setTag(holder);
        } else {
            holder = (ViewHolder)view.getTag();
        }

        holder.textView.setText("gunner");
        Glide.with(view).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1530017790764&di=5de95728df72e0605106e8bda328b99b&imgtype=0&src=http%3A%2F%2Fwww.taopic.com%2Fuploads%2Fallimg%2F140313%2F235026-1403130Z43831.jpg").into(holder.imageView);

        return view;
    }
}
