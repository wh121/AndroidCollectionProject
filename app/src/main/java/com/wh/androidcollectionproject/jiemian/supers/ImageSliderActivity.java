package com.wh.androidcollectionproject.jiemian.supers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.wh.androidcollectionproject.R;

import java.util.HashMap;

/**
 * https://github.com/daimajia/AndroidImageSlider
 * <p>
 * AndroidImageSlider可以很好的代替ViewPager实现滑动翻页广告栏，而且实现了无限循环和自动播放，建议在开发中直接使用
 * <p>
 * 例外如果想把小圆点去掉 可以 在布局里添加 ：  app:indicator_visibility="invisible"
 */
public class ImageSliderActivity extends AppCompatActivity implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {

    private SliderLayout mDemoSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_slider);
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);
        HashMap<String, String> url_maps = new HashMap<String, String>();
        url_maps.put("安卓UI实战", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1496279652716&di=e76c15f0641a4e9a53ad7314369ccf45&imgtype=0&src=http%3A%2F%2Fww2.sinaimg.cn%2Fbmiddle%2F005xFAqKjw1ep2zyiigs0j30k00b4wg8.jpg");
        url_maps.put("极客学院", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1496874181&di=669b65f28984a07b5ff0376adaaec7f4&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.lagou.com%2Fthumbnail_600x360%2Fimage1%2FM00%2F17%2F9C%2FCgYXBlUSM0yAendOAACMLQAg0i4619.jpg");
        url_maps.put("编程是一种信仰", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1496279502516&di=fd2f9e0726212bfcbb3a64c8273d8428&imgtype=0&src=http%3A%2F%2Fyohotry.com%2FUploads%2FEditor%2F2015-10-27%2F562f977f17b54.jpg");
        url_maps.put("安全隐私", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1496279598144&di=e324f1def0b34e9c8a3e23d0577edadb&imgtype=0&src=http%3A%2F%2Fa1.jikexueyuan.com%2Fhome%2F201604%2F29%2F982e%2F5722c2ec36c43.jpg");
        
        for (String name : url_maps.keySet()) {
            TextSliderView textSliderView = new TextSliderView(this);
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(url_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.CenterCrop)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra", name);

            mDemoSlider.addSlider(textSliderView);
        }
        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Default);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        mDemoSlider.setDuration(4000);
        mDemoSlider.addOnPageChangeListener(this);
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {
        Toast.makeText(this, slider.getBundle().get("extra") + "", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        Log.d("Slider Demo", "Page Changed: " + position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
