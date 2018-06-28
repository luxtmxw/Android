package com.example.qmdjx.textview.recycleview;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Toast;

import com.example.qmdjx.textview.R;

public class FlowRecycleActivity extends AppCompatActivity {
    private RecyclerView mRvFlow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flow_recycle);

        mRvFlow = findViewById(R.id.rv_flow);
        mRvFlow.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        mRvFlow.addItemDecoration(new MyDecoration());
        mRvFlow.setAdapter(new FlowAdapter(FlowRecycleActivity.this, new FlowAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(FlowRecycleActivity.this,""+pos,Toast.LENGTH_SHORT).show();
            }
        }));
    }

    class MyDecoration extends RecyclerView.ItemDecoration {
        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            super.getItemOffsets(outRect,view,parent,state);
            int gap = getResources().getDimensionPixelOffset(R.dimen.dividerHeight2);
            outRect.set(gap,gap,gap,gap);
        }

    }

}
