package com.wh.androidcollectionproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wh.androidcollectionproject.jiemian.JieMianActivity;
import com.wh.androidcollectionproject.kuangjia.KuangJiaActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnKuangjia)
    void kuangjia() {
        Intent intent = new Intent(this, KuangJiaActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnJieMian)
    void jiemian() {
        Intent intent = new Intent(this, JieMianActivity.class);
        startActivity(intent);
    }
}
