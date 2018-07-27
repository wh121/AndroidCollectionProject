package com.wh.androidcollectionproject.kuangjia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wh.androidcollectionproject.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class KuangJiaActivity extends AppCompatActivity {

    @BindView(R.id.tvButterKnife)
    TextView tvButterKnife;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kuang_jia);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnButterKnife)
    void butterKnifeClick() {
        tvButterKnife.setText("butterknife测试成功！");

    }

    @OnClick(R.id.btnNavigationTabBar)
    void navigationTabBarClick() {
        Intent intent = new Intent(this, NavigationTabBarActivity.class);
        startActivity(intent);
    }

}
