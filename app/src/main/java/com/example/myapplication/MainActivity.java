package com.example.myapplication;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mTv = (TextView) findViewById(R.id.tv);
        mTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                oneTest();
                twoTest();
            }
        });
    }

    private void twoTest() {
        FragmentManager fm = getSupportFragmentManager();
        BottomDialog2 mBottomDialog2 = new BottomDialog2();
        mBottomDialog2.show(fm,"fragment_bottom_dialog2");
    }

    private void oneTest() {
        FragmentManager mFragmentManager = getSupportFragmentManager();
        BottomDialog mBottomDialog = new BottomDialog();
        mBottomDialog.show(mFragmentManager,"fragment_dialog");
    }
}
