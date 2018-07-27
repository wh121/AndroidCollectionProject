package com.wh.androidcollectionproject.jiemian.utils;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wh.androidcollectionproject.R;


/**
 * Created by 王翰 on 2018/7/14.
 */

public class


ToolsBar extends ViewGroup {

    Context mContext;
    ConstraintLayout mToolBar;

    ImageView mIcon;
    boolean hasIcon = false;
    TextView mTitle;
    LinearLayout mButtons;


    public static final int TEXT_LEFT = 0;

    public ToolsBar(Context context) {
        super(context);
        initViews(context);
    }

    public ToolsBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initViews(context);
    }

    public ToolsBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initViews(context);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        mToolBar.layout(l,t,r,b);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mToolBar.measure(widthMeasureSpec,heightMeasureSpec);

    }


    private  void initViews(Context context){
        mContext = context;
        mToolBar = (ConstraintLayout) LayoutInflater.from(context).inflate(R.layout.jk_toolbar_layout,this,false);
        addView(mToolBar);  //不能缺少
        mIcon = (ImageView) mToolBar.findViewById(R.id.jk_toolbar_icon);
        mTitle = (TextView) mToolBar.findViewById(R.id.jk_toolbar_title);
        mButtons = (LinearLayout) mToolBar.findViewById(R.id.jk_toolbar_buttons);
    }

    public void setIcon(int resourceId, OnClickListener listener){
        mIcon.setImageResource(resourceId);
        hasIcon = true;
        mIcon.setClickable(true);
        mIcon.setOnClickListener(listener);
    }

    public void setTitle(String title){
        mTitle.setText(title);

    }


    public void setTitleAlign(int alignment){
        ConstraintLayout.LayoutParams param = (ConstraintLayout.LayoutParams) mTitle.getLayoutParams();
        if (alignment==TEXT_LEFT){
            if (hasIcon) {
                param.leftToLeft = -1;
                param.leftToRight = R.id.jk_toolbar_icon;

            }
            mTitle.setTextAlignment(TEXT_ALIGNMENT_TEXT_START);
            mTitle.setLayoutParams(param);

        }

    }

    /*
        添加按钮的优化方案：
        通过LinearLayout作为容器来添加按钮只是为了减少代码量的折中方案，使用这种方法添加的按钮，可能会出现位置不准确的问题。
        比较好的解决方案 是在当前的类中，定义一个按钮的数组
        把新建的按钮添加到数组中，并单独设置对标题栏控件的约束和位置参数
    */
    public void addButton(String title, OnClickListener listener){
        Button button = new Button(mContext);
        button.setText(title);
        button.setTextColor(Color.WHITE);
        button.setBackgroundColor(Color.TRANSPARENT);
        button.setOnClickListener(listener);

        mButtons.addView(button);
    }
    public void addButton(int background, OnClickListener listener){
        ImageView button = new ImageView(mContext);
        button.setClickable(true);
        button.setImageResource(background);
        button.setOnClickListener(listener);

        mButtons.addView(button);
    }

}
