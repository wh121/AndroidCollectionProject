package com.wh.androidcollectionproject.jiemian.infos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.wh.androidcollectionproject.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoadingStatusActivity extends AppCompatActivity {

    @BindView(R.id.btn_loadingLayout)
    Button btn_loadingLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_status);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_loadingLayout)
    void loadingLayoutMoth() {
        //使用LoadingLayout方法加载各种状态
        Intent intent = new Intent(this, LoadingLayoutActivity.class);
        startActivity(intent);

    }
}
