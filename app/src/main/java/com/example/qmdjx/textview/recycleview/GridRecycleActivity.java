package com.example.qmdjx.textview.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.qmdjx.textview.R;

public class GridRecycleActivity extends AppCompatActivity {

    private RecyclerView mRvGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycle);

        mRvGrid = findViewById(R.id.rv_grid);
        mRvGrid.setLayoutManager(new GridLayoutManager(GridRecycleActivity.this,3));
        mRvGrid.setAdapter(new GridAdapter(GridRecycleActivity.this, new GridAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(GridRecycleActivity.this,""+pos,Toast.LENGTH_SHORT).show();
            }
        }));

    }
}
