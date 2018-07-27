

package com.wh.androidcollectionproject.kuangjia;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import com.wh.androidcollectionproject.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import devlight.io.library.ntb.NavigationTabBar;

public class NavigationTabBarActivity extends AppCompatActivity {

    @BindView(R.id.vp)
    ViewPager vp;
    @BindView(R.id.ntb)
    NavigationTabBar ntb;


    private String[] colors;
    private String[] titles;
    private int[] viewsBg;
    private int[] icons;
    ArrayList<View> views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_tab_bar);
        ButterKnife.bind(this);
        initSetDatas();
        initViews();
    }

    //设置初始化值
    private void initSetDatas() {

        colors = new String[]{"#cc0000", "#11cc11", "#2222cc"};
        titles = new String[]{"首页", "课程", "我的"};
        views = new ArrayList<View>();
        viewsBg = new int[]{Color.RED, Color.GREEN, Color.BLUE};
        icons = new int[]{R.drawable.home, R.drawable.list, R.drawable.mine};
    }

    /**
     * 初始化 控件
     */
    private void initViews() {
        ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            models.add(
                    new NavigationTabBar.Model.Builder(
                            getResources().getDrawable(icons[i]),
                            Color.parseColor(colors[i])
                    ).title(titles[i])
                            .build()
            );

            View view = new View(this);
            view.setBackgroundColor(viewsBg[i]);
            views.add(view);
        }

        vp.setAdapter(new NTBAdapter());
        ntb.setModels(models);
        ntb.setViewPager(vp);
    }

    class NTBAdapter extends PagerAdapter {
        @Override
        public int getCount() {
            return views.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(views.get(position));
            return views.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(views.get(position));
        }
    }
}
