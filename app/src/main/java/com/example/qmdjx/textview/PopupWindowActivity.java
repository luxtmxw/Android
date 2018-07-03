package com.example.qmdjx.textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.qmdjx.textview.util.ToastUtil;

import org.w3c.dom.Text;

public class PopupWindowActivity extends AppCompatActivity {

    private Button mBtnPop;
    private PopupWindow mPopWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_window);
        mBtnPop = findViewById(R.id.btn_pop);
        mBtnPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View popView = getLayoutInflater().inflate(R.layout.layout_pop,null);
                mPopWindow = new PopupWindow(popView,mBtnPop.getWidth(), ViewGroup.LayoutParams.WRAP_CONTENT);
                TextView textView = popView.findViewById(R.id.tv_good);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mPopWindow.dismiss();
                        ToastUtil.showMsg(PopupWindowActivity.this,"好");
                    }
                });
                mPopWindow.setFocusable(true);
                mPopWindow.showAsDropDown(mBtnPop);
            }
        });
    }
}
