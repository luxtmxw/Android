package com.example.qmdjx.textview.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.qmdjx.textview.R;

public class CustomDialog extends Dialog  implements View.OnClickListener {

    private TextView mTvTitle,mTvMessage,mTvCancel,mTvConfirm;
    private String title,msg,cancel,confirm;
    private IOnCancelListener cancelListener;
    private IOnConfirmListener confirmListener;


    public CustomDialog setTitle(String title) {
        this.title = title;
        return this;
    }

    public CustomDialog setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public CustomDialog setCancel(String cancel, IOnCancelListener listener) {
        this.cancelListener = listener;
        this.cancel = cancel;
        return this;
    }

    public CustomDialog setConfirm(String confirm, IOnConfirmListener listener) {
        this.confirmListener = listener;
        this.confirm = confirm;
        return this;
    }



    public CustomDialog(@NonNull Context context) {
        super(context);
    }

    public CustomDialog(@NonNull Context context, int themeId) {
        super(context,themeId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_custom_dialog);

        WindowManager m = getWindow().getWindowManager();
        Display d = m.getDefaultDisplay();
        WindowManager.LayoutParams p = getWindow().getAttributes();
        Point size = new Point();
        d.getSize(size);
        p.width = (int)(size.x * 0.8);
        getWindow().setAttributes(p);

        mTvTitle = findViewById(R.id.customDialog_tv_title);
        mTvMessage = findViewById(R.id.customDialog_tv_msg);
        mTvCancel = findViewById(R.id.customDialog_tv_cancel);
        mTvConfirm = findViewById(R.id.customDialog_tv_comfirm);

        if (!TextUtils.isEmpty(title)) {
            mTvTitle.setText(title);
        }

        if (!TextUtils.isEmpty(msg)) {
            mTvMessage.setText(msg);
        }

        if (!TextUtils.isEmpty(cancel)) {
            mTvCancel.setText(cancel);
        }

        if (!TextUtils.isEmpty(confirm)) {
            mTvConfirm.setText(confirm);
        }

        mTvCancel.setOnClickListener(this);
        mTvConfirm.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.customDialog_tv_cancel:
                if (cancelListener != null) {
                    cancelListener.onCancel(this);
                }
                break;
            case R.id.customDialog_tv_comfirm:
                if (confirmListener != null) {
                    confirmListener.onConfirm(this);
                }
                break;
        }
    }

    public interface IOnCancelListener {
        void onCancel(CustomDialog dialog);
    }

    public interface IOnConfirmListener {
        void onConfirm(CustomDialog dialog);
    }
}
