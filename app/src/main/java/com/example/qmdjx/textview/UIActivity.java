package com.example.qmdjx.textview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.qmdjx.textview.gridview.GridViewActivity;
import com.example.qmdjx.textview.listview.ListViewActivity;
import com.example.qmdjx.textview.recycleview.RecycleViewActivity;

public class UIActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mBtnBtn;
    private Button mBtnEditText;
    private Button mBtnRadioBtn;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnGradView;
    private Button mBtnRecycleView;
    private Button mBtnWebView;
    private Button mBtnToast;
    private Button mBtnDialogBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);

        mBtnTextView = findViewById(R.id.btn_textview);
        mBtnBtn = findViewById(R.id.btn_btn);
        mBtnEditText = findViewById(R.id.btn_editText);
        mBtnRadioBtn = findViewById(R.id.btn_radioBtn);
        mBtnCheckBox = findViewById(R.id.btn_checkBoxBtn);
        mBtnImageView = findViewById(R.id.btn_imageViewBtn);
        mBtnListView = findViewById(R.id.btn_listViewBtn);
        mBtnGradView = findViewById(R.id.btn_gridViewBtn);
        mBtnRecycleView = findViewById(R.id.btn_recycleViewBtn);
        mBtnWebView = findViewById(R.id.btn_webViewBtn);
        mBtnToast = findViewById(R.id.btn_toastBtn);
        mBtnDialogBtn = findViewById(R.id.btn_dialogBtn);

        setListener();
    }

    private void setListener() {
        OnClick onClick = new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnBtn.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRadioBtn.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
        mBtnGradView.setOnClickListener(onClick);
        mBtnRecycleView.setOnClickListener(onClick);
        mBtnWebView.setOnClickListener(onClick);
        mBtnToast.setOnClickListener(onClick);
        mBtnDialogBtn.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()) {
                case R.id.btn_textview:
                    intent = new Intent(UIActivity.this,TextViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_btn:
                    intent = new Intent(UIActivity.this,ButtonActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_editText:
                    intent = new Intent(UIActivity.this,EditTextActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_radioBtn:
                    intent = new Intent(UIActivity.this,RadioButtonActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_checkBoxBtn:
                    intent = new Intent(UIActivity.this,CheckBoxActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_imageViewBtn:
                    intent = new Intent(UIActivity.this,ImageViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_listViewBtn:
                    intent = new Intent(UIActivity.this,ListViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_gridViewBtn:
                    intent = new Intent(UIActivity.this,GridViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_recycleViewBtn:
                    intent = new Intent(UIActivity.this,RecycleViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_webViewBtn:
                    intent = new Intent(UIActivity.this,WebViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_toastBtn:
                    intent = new Intent(UIActivity.this,ToastActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_dialogBtn:
                    intent = new Intent(UIActivity.this,DialogActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    }


}
