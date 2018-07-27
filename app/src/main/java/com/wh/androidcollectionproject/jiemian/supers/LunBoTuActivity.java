package com.wh.androidcollectionproject.jiemian.supers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.wh.androidcollectionproject.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LunBoTuActivity extends AppCompatActivity {

    @BindView(R.id.btn_imageSlide_one)
    Button btn_imageSlide_one;

    @BindView(R.id.btn_imageSlide_two)
    Button btn_imageSlide_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lun_bo_tu);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_imageSlide_one)
    void imageSlideOMoth() {
        //广告轮播组件AndroidImageSlider
        Intent intent = new Intent(this, ImageSliderActivity.class);
        startActivity(intent);

    }


    @OnClick(R.id.btn_imageSlide_two)
    void imageSlideneTwoMoth() {
        //广告轮播组件AndroidImageSlider
        Intent intent = new Intent(this, ImageSliderTwoActivity.class);
        startActivity(intent);

    }
}
