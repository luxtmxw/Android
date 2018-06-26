package com.example.qmdjx.textview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mBtnBtn;
    private Button mBtnEditText;
    private Button mBtnRadioBtn;
    private Button mBtnCheckBox;
    private Button mBtnImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnTextView = findViewById(R.id.btn_textview);
        mBtnBtn = findViewById(R.id.btn_btn);
        mBtnEditText = findViewById(R.id.btn_editText);
        mBtnRadioBtn = findViewById(R.id.btn_radioBtn);
        mBtnCheckBox = findViewById(R.id.btn_checkBoxBtn);
        mBtnImageView = findViewById(R.id.btn_imageViewBtn);

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
    }

    private class OnClick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()) {
                case R.id.btn_textview:
                    intent = new Intent(MainActivity.this,TextViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_btn:
                    intent = new Intent(MainActivity.this,ButtonActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_editText:
                    intent = new Intent(MainActivity.this,EditTextActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_radioBtn:
                    intent = new Intent(MainActivity.this,RadioButtonActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_checkBoxBtn:
                    intent = new Intent(MainActivity.this,CheckBoxActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_imageViewBtn:
                    intent = new Intent(MainActivity.this,ImageViewActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    }


}
