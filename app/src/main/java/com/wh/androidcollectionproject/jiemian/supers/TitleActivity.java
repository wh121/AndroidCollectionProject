package com.wh.androidcollectionproject.jiemian.supers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.wh.androidcollectionproject.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TitleActivity extends AppCompatActivity {

    @BindView(R.id.btn_title_one)
    Button btn_title_one;

    @BindView(R.id.btn_title_two)
    Button btn_title_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.btn_title_one)
    void titleOneMeth() {
        //用ConstraintLayout打造经典自定义标题栏---简单的用法
        Intent intent = new Intent(this, ContainLayoutTitleActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_title_two)
    void titleTwoMeth() {
        //用ConstraintLayout打造经典自定义标题栏---进一步的扩展
        Intent intent = new Intent(this, ContainLayoutTitleTwoActivity.class);
        startActivity(intent);
    }
}
