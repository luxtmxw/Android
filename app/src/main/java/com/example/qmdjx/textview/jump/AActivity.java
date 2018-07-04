package com.example.qmdjx.textview.jump;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.qmdjx.textview.R;
import com.example.qmdjx.textview.util.ToastUtil;

public class AActivity extends AppCompatActivity {

    private Button mBtnjumpB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        mBtnjumpB = findViewById(R.id.btn_jump_b);
        mBtnjumpB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //显式1
                Intent intent = new Intent(AActivity.this,BActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name","mxw");
                bundle.putInt("age",18);
                intent.putExtras(bundle);
//                startActivity(intent);
                startActivityForResult(intent,0);

                //显式2
//                Intent intent = new Intent();
//                intent.setClass(AActivity.this,BActivity.class);
//                startActivity(intent);

                //显式3
//                Intent intent = new Intent();
//                intent.setClassName(AActivity.this,"com.example.qmdjx.textview.jump.BActivity");
//                startActivity(intent);

                //显式4
//                Intent intent = new Intent();
//                intent.setComponent(new ComponentName(AActivity.this,"com.example.qmdjx.textview.jump.BActivity"));
//                startActivity(intent);

                //隐氏
//                Intent intent = new Intent();
//                intent.setAction("com.mxw.test.BActivity");
//                startActivity(intent);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ToastUtil.showMsg(AActivity.this,data.getExtras().getString("back"));
    }
}
