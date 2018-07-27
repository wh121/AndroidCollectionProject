package com.wh.androidcollectionproject.jiemian.supers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.wh.androidcollectionproject.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SuperActivity extends AppCompatActivity {

    @BindView(R.id.btn_luobo)
    Button btn_luobo;

    @BindView(R.id.btn_title)
    Button btn_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supers);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_luobo)
    void luoboMeth() {
        //首页轮播图汇集
        Intent intent = new Intent(this, LunBoTuActivity.class);
        startActivity(intent);
    }


    @OnClick(R.id.btn_title)
    void titleMeth() {
        //首页轮播图汇集
        Intent intent = new Intent(this, TitleActivity.class);
        startActivity(intent);
    }
}
