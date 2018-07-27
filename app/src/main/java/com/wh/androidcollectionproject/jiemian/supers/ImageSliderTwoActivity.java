
package com.wh.androidcollectionproject.jiemian.supers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.wh.androidcollectionproject.R;

import java.util.ArrayList;
import java.util.List;

public class ImageSliderTwoActivity extends AppCompatActivity implements View.OnClickListener {

    private SliderLayout slider;
    private PagerIndicator custom_indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_slider_two);
        initView();
        initData();

    }


    private void initView() {
        slider = (SliderLayout) findViewById(R.id.slider);
        custom_indicator = (PagerIndicator) findViewById(R.id.custom_indicator);
    }

    private void initData() {
        //准备好要显示的数据
        List<String> imageUrls = new ArrayList<>();
        final List<String> descriptions = new ArrayList<>();
        imageUrls.add("http://m.360buyimg.com/mobilecms/s300x98_jfs/t2416/102/20949846/13425/a3027ebc/55e6d1b9Ne6fd6d8f.jpg");
        imageUrls.add("http://m.360buyimg.com/mobilecms/s300x98_jfs/t1507/64/486775407/55927/d72d78cb/558d2fbaNb3c2f349.jpg");
        imageUrls.add("http://m.360buyimg.com/mobilecms/s300x98_jfs/t1363/77/1381395719/60705/ce91ad5c/55dd271aN49efd216.jpg");
        descriptions.add("新品推荐");
        descriptions.add("时尚男装");
        descriptions.add("家电秒杀");
        for (int i = 0; i < imageUrls.size(); i++) {
            //新建三个展示View，并且添加到SliderLayout
            TextSliderView tsv = new TextSliderView(this);
            tsv.image(imageUrls.get(i)).description(descriptions.get(i));
            final int finalI = i;
            tsv.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(BaseSliderView slider) {
                    Toast.makeText(ImageSliderTwoActivity.this, descriptions.get(finalI), Toast.LENGTH_SHORT).show();
                }
            });
            slider.addSlider(tsv);
        }
        //对SliderLayout进行一些自定义的配置
        slider.setCustomAnimation(new DescriptionAnimation());
        slider.setPresetTransformer(SliderLayout.Transformer.Default);
        slider.setDuration(3000);
        slider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        slider.setCustomIndicator(custom_indicator);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //case R.id
        }
    }
}
