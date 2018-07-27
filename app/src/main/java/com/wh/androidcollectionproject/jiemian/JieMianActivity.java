package com.wh.androidcollectionproject.jiemian;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.wh.androidcollectionproject.R;
import com.wh.androidcollectionproject.jiemian.infos.LoadingStatusActivity;
import com.wh.androidcollectionproject.jiemian.supers.SuperActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 只要是收集比较流行的开源界面所需要的知识点汇集
 */
public class JieMianActivity extends AppCompatActivity {

    @BindView(R.id.btn_status)
    Button btn_status;
    @BindView(R.id.btn_super)
    Button btn_super;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jie_mian);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_status)
    void OneStatus() {
        //页面加载状态汇集
        Intent intent = new Intent(this, LoadingStatusActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_super)
    void setBtn_super() {
        //首页所需的知识点汇集
        Intent intent = new Intent(this, SuperActivity.class);
        startActivity(intent);
    }
}
