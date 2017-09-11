package com.example.administrator.bigmap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private MyView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {

    }

    private void initView() {
        mView = (MyView) findViewById(R.id.mView);
        try {
            mView.setInputStream(getAssets().open("qm.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
