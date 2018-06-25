package com.example.qmdjx.textview;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView mTv_4, mTv_5, mTv_6, mTv_7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv_4 = findViewById(R.id.tv_4);
        mTv_4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        mTv_4.getPaint().setAntiAlias(true);//去除锯齿mTv_5;

        mTv_5 = findViewById(R.id.tv_5);
        mTv_5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        mTv_5.getPaint().setAntiAlias(true);

        mTv_6 = findViewById(R.id.tv_6);
        mTv_6.setText(Html.fromHtml("<u>かもしれない</u>"));

        mTv_7 = findViewById(R.id.tv_7);
        mTv_7.setSelected(true);
    }
}
