package com.example.qmdjx.textview.jump;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.qmdjx.textview.R;

public class BActivity extends AppCompatActivity {
    private TextView mTvTitle;
    private Button mBtnJumpA;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        final Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        int age = bundle.getInt("age");

        mTvTitle = findViewById(R.id.jump_b_tv_title);
        mTvTitle.setText(name + "----" + age);

        mBtnJumpA = findViewById(R.id.btn_jump_a);
        mBtnJumpA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                Bundle bundle1 = new Bundle();
                bundle1.putString("back","back");
                intent.putExtras(bundle1);
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });
    }
}
